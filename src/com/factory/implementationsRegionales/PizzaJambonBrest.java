package com.factory.implementationsRegionales;

import com.factory.abstractions.pizza.Pizza;

public class PizzaJambonBrest extends Pizza {
    public PizzaJambonBrest(){
        nom = "Pizza jambon Brest au lardons";

        garnitures.add("Lardons fumées nature");
    }

    @Override
    protected void preparer() {

    }
}
