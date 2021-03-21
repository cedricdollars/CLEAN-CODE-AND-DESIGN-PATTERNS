package com.factory;

public class SimplePizzaFactory {
    public Pizza CreerPizza(String type){
        Pizza pizza = null;
        if(type.equals("fromage")){
            pizza = new PizzaFromage();
        }
        else if(type.equals("Jambon")){
            pizza = new PizzaJambon();
        }
        else if(type.equals("Grecque")){
            pizza = new PizzaGrecque();
        }
        return pizza;
    }
}
