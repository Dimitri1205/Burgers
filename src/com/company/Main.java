package com.company;

import com.company.additions.*;
import com.company.burgers.BasicBurger;
import com.company.burgers.DeluxeBurger;
import com.company.burgers.HealthyBurger;

public class Main {

    public static void main(String[] args) {
        //mogu se inicijalizovati prilozi a mogu i new u konstruktor
        Cheese cheese = new Cheese();

        BasicBurger basic1 = new BasicBurger("Burger 1", "Regular", "Beef", 15);
        BasicBurger basic2 = new BasicBurger("Burger 2", "Dark", "Pork", 12);

        HealthyBurger healthy1 = new HealthyBurger("Beef", 17);
        HealthyBurger healthy2 = new HealthyBurger("Pork", 15);

        DeluxeBurger deluxe1 = new DeluxeBurger("White", "Beef", 24);
        DeluxeBurger deluxe2 = new DeluxeBurger("Whole Grain", "Lamb", 23);

        basic1.addCondiments(new Tomato(), new Lettuce(), new Pickle(), new Chips());
        //testiranje vise od 4
        basic2.addCondiments(cheese, new Tomato(), new Pickle(), new Lettuce(), new Coke());

        healthy1.addCondiments(new Cheese(), new Lettuce(), new Tomato(), new Pickle(), new Coke(), new Chips());
        //testiranje vise od 6
        healthy2.addCondiments(new Cheese() ,new Cheese(), new Lettuce(), new Tomato(), new Pickle(), new Coke(), new Chips());

        //testiranje dodavanja additiona u delux
        deluxe2.addCondiments(new Cheese());

        //stampanje
        System.out.println("==============");
        System.out.println(basic1.showPrice());
        System.out.println(basic2.showPrice());
        System.out.println(healthy1.showPrice());
        System.out.println(healthy2.showPrice());
        System.out.println(deluxe1.showPrice());
        System.out.println(deluxe2.showPrice());
    }
}
