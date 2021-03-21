package com.factory;

public class PizzaFromage extends Pizza {
    private double prix;
    private String description;

    public PizzaFromage(){
        this.prix = 9.89;
        this.description = "Pizza fromage";

    }

    public String getDescription() {
        return description;
    }

    @Override
    public void preparer() {
        System.out.println(getDescription() + " en cours de préparation");
    }

    @Override
    public void cuire() {
        System.out.println("Cuisson");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage");
    }

    @Override
    public void decouper() {
        System.out.println("Bon apétit!!!");
    }
}
