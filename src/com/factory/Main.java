package com.factory;

import com.factory.abstractions.pizza.Pizza;
import com.factory.abstractions.pizza.Pizzeria;
import com.factory.factorySimple.PizzaFromage;
import com.factory.implementationsRegionales.PizzeriaBrest;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeriaBrest = new PizzeriaBrest();
        pizzeriaBrest.commanderPizza("fromage");


    }
}
