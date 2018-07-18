package org.launchcode.offsitesales.controllers;

import org.launchcode.offsitesales.models.data.YearDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("year")
public class YearController {

    @Autowired
    private YearDao yearDao;

    //Request path: /year
    @RequestMapping(value="")
    public String index(Model model) {
        model.addAttribute("years", yearDao.findAll());
        model.addAttribute("title", "Years");

        return "year/index";
    }
}
