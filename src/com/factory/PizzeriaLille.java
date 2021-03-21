package com.factory;

public class PizzeriaLille extends Pizzeria{

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
