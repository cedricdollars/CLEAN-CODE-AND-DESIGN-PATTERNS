package com.factory.implementationsRegionales;

import com.factory.abstractions.pizza.Pizza;

public class PizzaFromageLille extends Pizza {
    public PizzaFromageLille() {
        nom = "Pizza fromage Lille";
        garnitures.add("Tomate oignons");
    }

    @Override
    protected void preparer() {

    }
}
