package com.decorator;

public class Caramel extends DecorateurIngredient{
    Boisson boisson;

    public Caramel(Boisson boisson){
        this.boisson = boisson;
    }
    @Override
    public double cout() {
        return 0.15 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }
}
