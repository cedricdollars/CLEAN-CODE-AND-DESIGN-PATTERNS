package com.factory.abstractions.pizza;

import com.factory.abstractions.ingredients.*;

import java.util.ArrayList;

public abstract class Pizza {
    protected String nom;
    protected Sauce sauce;
    protected Fromage fromage;
    protected Legume legumes[];
    protected Poivron poivrons;
    protected Pate pate;
    protected ArrayList garnitures = new ArrayList();

    protected abstract void preparer();
    void cuire(){
        System.out.println("25 min de cuissons");
    }
    void emballer() {
        System.out.println("Emballage dans la boite à pizza");
    }
    void decouper() {
        System.out.println("Découpage en 4 tranches");
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
