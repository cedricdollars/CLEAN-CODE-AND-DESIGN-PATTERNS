package com.factory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String nom;
    protected String sauce;
    protected ArrayList garnitures = new ArrayList();
    void preparer() {
        System.out.println("Pizza " + nom + " en cours de préparation");
        System.out.println("Sauce " + sauce);
        System.out.println("Ajout des garnitures: ");
        for(int i= 0; i < garnitures.size(); i++){
            System.out.println(" " + garnitures.get(i));
        }
    }
    void cuire(){
        System.out.println("25 min de cuissons");
    }
    void emballer() {
        System.out.println("Emballage de la pizza");
    }
    void decouper() {
        System.out.println("Découpage en 4 tranches");
    }
    String getNom() {
        return nom;
    }
}
