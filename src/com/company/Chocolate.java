package com.company;

public class Chocolate extends Products {
    public String name;
    public Integer cost;

    public Chocolate() {
        this.name = "Chocolate";
        this.cost = 40;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
