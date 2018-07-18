package org.launchcode.offsitesales.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size (min=3, max=25)
    private String name;

    @NotNull
    @Size (min=3, max=25)
    private String location;

    //@ManyToMany(mappedBy = "events")
    //private List<Month> months;

    //@ManyToMany(mappedBy = "events")
    //private List<Year> years;

    @NotNull
    private double cost;

    @NotNull
    private double sales;

    //@NotNull
    //private double returnOnInvestment;

    public Event(String name, String location, double cost, double sales) {
        this.name = name;
        this.location = location;
        this.cost = cost;
        this.sales = sales;
    }

    public Event(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //public List<Month> getMonths() {
       // return months;
    //}

   // public void setMonths(List<Month> months) {
     //   this.months = months;
    //}

    //public List<Year> getYears() {
      //  return years;
    //}

    //public void setYears(List<Year> years) {
      //  this.years = years;
    //}

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}

