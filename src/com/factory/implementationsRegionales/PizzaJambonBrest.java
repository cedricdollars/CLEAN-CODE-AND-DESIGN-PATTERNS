package com.factory.implementationsRegionales;

import com.factory.abstractions.pizza.Pizza;

public class PizzaJambonBrest extends Pizza {
    public PizzaJambonBrest(){
        nom = "Pizza jambon Brest au lardons";
        sauce = "Blanche";
        garnitures.add("Lardons fumées nature");
    }
}
