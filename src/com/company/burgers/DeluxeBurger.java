package com.company.burgers;

import com.company.additions.Addition;
import com.company.additions.Chips;
import com.company.additions.Coke;

public class DeluxeBurger extends BasicBurger {



    public DeluxeBurger(String bread, String meat, double price) {
        super("Deluxe Hamburger", bread, meat, price);
        super.addCondiments(new Chips(), new Coke());
    }

    @Override
    public void addCondiments(Addition... add) {
        System.out.println("Additions for this type of burger are not allowed");
    }



}
