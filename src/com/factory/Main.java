package com.factory;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeriaBrest = new PizzeriaBrest();
        Pizza pizza = pizzeriaBrest.commanderPizza("fromage");
        System.out.println("Cédric a commandé une pizza " + pizza.getNom() + "\n" );
        System.out.println("Bon apétit 😊");

    }
}
