package com.company;

import java.util.List;

public class Printer {

    private static final void printCat(Products products) {
        System.out.println(String.format("Вы купили %10.10s | за  %3.3s |", products.getName(), products.getCost()));
    }

    public static final void print(List<Products> products) {
        products.forEach(Printer::printCat);
        System.out.println();
    }

}
