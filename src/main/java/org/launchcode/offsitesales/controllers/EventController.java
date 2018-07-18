package org.launchcode.offsitesales.controllers;


import org.launchcode.offsitesales.models.Event;
import org.launchcode.offsitesales.models.data.EventDao;
import org.launchcode.offsitesales.models.data.MonthDao;
import org.launchcode.offsitesales.models.data.YearDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("event")
public class EventController {

    @Autowired
    private EventDao eventDao;

   // @Autowired
    //private MonthDao monthDao;

    //@Autowired
    //private YearDao yearDao;

    //Request path: /event
    @RequestMapping(value="")
    public String index(Model model) {
        model.addAttribute("events", eventDao.findAll());
        model.addAttribute("title", "All Offsite Events");

        return "event/index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String displayAddEventForm(Model model) {
        model.addAttribute("title", "Add Event");
        model.addAttribute(new Event());
        //model.addAttribute("months", monthDao.findAll());
        return "event/add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String processAddEventForm(@ModelAttribute @Valid Event newEvent, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Event");
            return "event/add";
        }
        eventDao.save(newEvent);
        return "redirect:";

    }

    @RequestMapping(value="remove", method= RequestMethod.GET)
    public String displayRemoveEventForm(Model model) {
        model.addAttribute("title", "Remove an Offsite Event");
        model.addAttribute("events", eventDao.findAll());
        return "event/remove";
        }

    @RequestMapping(value="remove", method = RequestMethod.POST)
    public String processRemoveEventForm(@RequestParam int[] eventIds) {
        for (int eventId : eventIds) {
            eventDao.deleteById(eventId);
        }
        return "redirect:";
    }

}
