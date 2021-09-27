package com.company;

import java.util.List;

public class SellMachine {
    private Integer money;
    Candies candie = new Candies();
    Apples apple = new Apples();
    Water water = new Water();
    Chocolate chocolate = new Chocolate();
    public SellMachine(){

    }

    public void printMenu(){
        System.out.println("В автомате доступны: ");
        System.out.println("[" + candie.cost + "] - "+ candie.name);
        System.out.println("[" + apple.cost + "] - "+ apple.name);
        System.out.println("[" + water.cost + "] - "+ water.name);
        System.out.println("[" + chocolate.cost + "] - "+ chocolate.name);



    }
}
