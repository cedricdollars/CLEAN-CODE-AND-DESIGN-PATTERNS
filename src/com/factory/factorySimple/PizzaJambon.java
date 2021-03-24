package com.factory.factorySimple;

import com.factory.abstractions.ingredients.FabriqueIngredientsPizza;
import com.factory.abstractions.pizza.Pizza;

public class PizzaJambon extends Pizza {

    FabriqueIngredientsPizza fabriqueIngredientsPizza;

    public PizzaJambon(FabriqueIngredientsPizza fabriqueIngredientsPizza) {
        this.fabriqueIngredientsPizza = fabriqueIngredientsPizza;
    }

    @Override
    protected void preparer() {
        System.out.println("Prépration de la pizza " +nom);
        pate = fabriqueIngredientsPizza.creerPate();
        fromage = fabriqueIngredientsPizza.creerFromage();
        sauce = fabriqueIngredientsPizza.creerSauce();
    }
}
