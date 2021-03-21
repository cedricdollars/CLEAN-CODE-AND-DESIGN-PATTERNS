package com.decorator;

public class StarbuzzCoffee {
    public static void main(String[] args){
        Boisson boisson = new Espresso();

        Boisson boisson1 = new Sumatra();
        boisson1 = new Chocolat(boisson1);
        boisson1 = new Lait(boisson1);
        boisson1 = new Caramel(boisson1);
        System.out.println(boisson1.getDescription() + " " + boisson1.cout() + " € ");
    }
}
