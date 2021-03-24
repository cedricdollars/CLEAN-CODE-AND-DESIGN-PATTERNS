package com.factory.implementationsRegionales;

import com.factory.abstractions.pizza.Pizza;

public class PizzaFromageLille extends Pizza {
    public PizzaFromageLille() {
        nom = "Pizza fromage Lille";
        sauce = "Sauce curry";
        garnitures.add("Tomate oignons");
    }
}
