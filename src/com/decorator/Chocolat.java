package com.decorator;

public class Chocolat extends DecorateurIngredient{
    Boisson boisson;

    public Chocolat(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    public Taille getTaille() {
        return boisson.getTaille();
    }

    @Override
    public double cout() {
        double cout = boisson.cout();
        if(getTaille()== Taille.GRANDE){
            cout += 0.10;
        }
        else if(getTaille() == Taille.NORMALE){
            cout += 0.15;
        }
        else if(getTaille() == Taille.PETITE) {
            cout += 0.20;
        }
       return cout;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", chocolat";
    }
}
