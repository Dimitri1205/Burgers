package com.company.burgers;

import com.company.additions.Addition;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicBurger {

    protected String name;
    protected String bread;
    protected String meat;

    protected ArrayList<Addition> additions;

    protected double basePrice;


    public BasicBurger(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.basePrice = price;
        this.additions = new ArrayList<>();
    }

    public void addCondiments(Addition... add) {
        if (add.length > 4) {
            System.out.println("Only 4 additions allowed");
        } else {
            for (Addition a: add) {
                additions.add(a);
            }
        }
    }


    public double totalPrice () {
        double res = 0;
        for (Addition a: additions) {
            res += a.getPrice();
        }
        res += basePrice;
        return res;
    }

    @Override
    public String toString() {
        return "Burger: " + name + ", Bread: " + bread + ", Meat: " + meat;
    }

    public String showPrice () {
        String st = toString() + "\n";
        st += "Base price: " + basePrice + "\n";
        st += "Additions: \n";
        if (!additions.isEmpty()) {
            for (Addition a : additions) {
                st += a.getName() + " - " + a.getPrice() + "\n";
            }
        }
        st += "Total: " + totalPrice();
        return st;
    }

}
