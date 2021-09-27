package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellMachine {
    private Integer money = 0;
    private List<Products> pokupki = new ArrayList<>();
    Candies candie = new Candies();
    Apples apple = new Apples();
    Water water = new Water();
    Chocolate chocolate = new Chocolate();

    public SellMachine(){
        deposit();
        printMenu();
        action();
    }

    public void action(){
        Scanner s = new Scanner(System.in);
        if (money < candie.cost){
            System.out.println("Что вы хотите сделать");
            System.out.println("1 - закинуть денег");
            System.out.println("2 - выйти");
            Integer choice = s.nextInt();
            if (choice == 1){
                deposit();
                printMenu();
                action();
            }else if (choice == 2){
                Printer.print(pokupki);
                System.exit(0);
            }
        } else if (money>= candie.cost && money < apple.cost){
        System.out.println("Что вы хотите сделать");
        System.out.println("1 - закинуть денег");
        System.out.println("2- купить конфету");
        System.out.println("3 выйти");
            Integer choice = s.nextInt();
            if (choice == 1){
                deposit();
                printMenu();
                action();
            }else if (choice == 2){
                money = money - candie.cost;
                pokupki.add(new Candies());
                printMenu();
                action();
            }else if (choice == 3){
                Printer.print(pokupki);
                System.exit(0);
            }
        }else if (money>= apple.cost && money < water.cost){
            System.out.println("Что вы хотите сделать");
            System.out.println("1 - закинуть денег");
            System.out.println("2- купить конфету");
            System.out.println("3- купить яблоко");
            System.out.println("4-  выйти");
            Integer choice = s.nextInt();
            if (choice == 1){
                deposit();
                printMenu();
                action();
            }else if (choice == 2){
                money = money - candie.cost;
                pokupki.add(new Candies());
                printMenu();
                action();
            }else if (choice == 3){
                money = money - apple.cost;
                pokupki.add(new Apples());
                printMenu();
                action();
            }else if (choice == 4){
                Printer.print(pokupki);
                System.exit(0);
            }
        }else if (money>= water.cost && money < chocolate.cost){
            System.out.println("Что вы хотите сделать");
            System.out.println("1 - закинуть денег");
            System.out.println("2- купить конфету");
            System.out.println("3- купить яблоко");
            System.out.println("4- купить воду");
            System.out.println("5 -  выйти");
            Integer choice = s.nextInt();
            if (choice == 1){
                deposit();
                printMenu();
                action();
            }else if (choice == 2){
                money = money - candie.cost;
                pokupki.add(new Candies());
                printMenu();
                action();
            }else if (choice == 3){
                money = money - apple.cost;
                pokupki.add(new Apples());
                printMenu();
                action();
            }else if (choice == 4){
                money = money - water.cost;
                pokupki.add(new Water());
                printMenu();
                action();
            }else if (choice == 5){
                Printer.print(pokupki);
                System.exit(0);
            }
        }else if (money>= chocolate.cost){
            System.out.println("Что вы хотите сделать");
            System.out.println("1 - закинуть денег");
            System.out.println("2- купить конфету");
            System.out.println("3- купить яблоко");
            System.out.println("4- купить воду");
            System.out.println("5- купить шоколадку");
            System.out.println("6 -  выйти");
            Integer choice = s.nextInt();
            if (choice == 1){
                deposit();
                printMenu();
                action();
            }else if (choice == 2){
                money = money - candie.cost;
                pokupki.add(new Candies());
                printMenu();
                action();
            }else if (choice == 3){
                money = money - apple.cost;
                pokupki.add(new Apples());
                printMenu();
                action();
            }else if (choice == 4){
                money = money - water.cost;
                pokupki.add(new Water());
                printMenu();
                action();
            }else if (choice == 5){
                money = money - chocolate.cost;
                pokupki.add(new Chocolate());
                printMenu();
                action();
            }else if (choice == 6){
                Printer.print(pokupki);
                System.exit(0);
            }
        }


    }
    public void printMenu(){
        if (money < candie.cost){
            System.out.println("В автомате доступны: ");
            System.out.println("[" + candie.cost + "] - " + candie.name);
            System.out.println("[" + apple.cost + "] - " + apple.name);
            System.out.println("[" + water.cost + "] - " + water.name);
            System.out.println("[" + chocolate.cost + "] - " + chocolate.name);
            System.out.println(String.format("Монет на сумму = ", money));
            System.out.println("Вы ничего не можете купить пополните счёт");
        }else if (money>candie.cost){
            System.out.println("В автомате доступны: ");
            System.out.println("[" + candie.cost + "] - " + candie.name);
            System.out.println("[" + apple.cost + "] - " + apple.name);
            System.out.println("[" + water.cost + "] - " + water.name);
            System.out.println("[" + chocolate.cost + "] - " + chocolate.name);
            System.out.println(String.format("Монет на сумму = ", money));
        }


    }

    public void deposit(){
        Scanner s = new Scanner(System.in);
        System.out.println("На сколько вы хотите пополнить автомат");
        Integer newMoney = s.nextInt();
        money = money + newMoney;
        System.out.println(String.format("Вы успешно пополнили автомат на %s теперь у вас %s монет", newMoney, money));
    }
}
