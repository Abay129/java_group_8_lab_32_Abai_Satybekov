package com.company;

public class Water {
    public String name;
    public Integer cost;

    public Water() {
        this.name = "Water";
        this.cost = 30;
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
