package org.launchcode.offsitesales.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Year {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min= 4, max=4)
    private int name;

    @OneToMany
    @JoinColumn(name = "year_id")
    private List<Event> events = new ArrayList<>();

    public Year () {    }

    public Year (int name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }

}
