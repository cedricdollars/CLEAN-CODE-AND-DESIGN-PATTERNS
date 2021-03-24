package com.factory.abstractions.pizza;

import com.factory.abstractions.pizza.Pizza;

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

     protected abstract Pizza creerPizza(String type);
}
