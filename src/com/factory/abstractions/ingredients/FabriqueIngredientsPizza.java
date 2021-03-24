package com.factory.abstractions.ingredients;

public interface FabriqueIngredientsPizza {
    public Pate creerPate();
    public Sauce creerSauce();
    public Fromage creerFromage();
    public Legume[] creerLegumes();
    public Poivron creerPoivrons();
}

