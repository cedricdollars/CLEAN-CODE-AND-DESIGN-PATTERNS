package com.factory;

public abstract class Pizzeria {

    public final Pizza commanderPizza(String type){
        Pizza pizza;
        pizza = creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.decouper();
        pizza.emballer();
        return pizza;
    }

     abstract Pizza creerPizza(String type);
}
