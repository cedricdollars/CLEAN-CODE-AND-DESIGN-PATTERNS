package com.factory.implementationsRegionales;

import com.factory.abstractions.pizza.Pizza;
import com.factory.abstractions.pizza.Pizzeria;

public class PizzeriaLille extends Pizzeria {

    @Override
    public Pizza creerPizza(String type) {
        switch (type){
            case "fromage":
                return new PizzaFromageLille();
            case "Jambon":
                return  new PizzaJambonLille();
            case "grecque":
                return  new PizzaGrecqueLille();
            default:
                return null;
        }
    }
}
