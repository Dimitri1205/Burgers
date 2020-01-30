package com.company.burgers;

import com.company.additions.Addition;

import java.util.ArrayList;
import java.util.Arrays;

public class HealthyBurger extends BasicBurger {


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "brown rye bread roll", meat, price);
    }

    @Override
    public void addCondiments(Addition... add) {
        if (add.length > 6) {
            System.out.println("Only 6 additions allowed");
        } else {
            this.additions = new ArrayList<>(Arrays.asList(add));
        }
    }


}
