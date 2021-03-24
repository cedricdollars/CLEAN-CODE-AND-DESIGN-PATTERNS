package com.factory.implementationsRegionales;

import com.factory.abstractions.pizza.Pizza;

public class PizzaFromageBrest extends Pizza {
    public PizzaFromageBrest() {
        nom = "Grande pizza 4 fromages de Brest";

        garnitures.add("Mozarella tortillas");
    }

    @Override
    protected void preparer() {

    }
}
