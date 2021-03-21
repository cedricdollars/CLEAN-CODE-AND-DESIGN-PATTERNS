package com.decorator;

public abstract class Boisson {

    String description = "Boisson inconnue";
     Taille taille;
    public Boisson(){

    }

    public Taille getTaille() {
        return taille;
    }

    public String getDescription(){
        return description;
    }


    public abstract double cout();

}
enum Taille {
    GRANDE, NORMALE, PETITE
}
