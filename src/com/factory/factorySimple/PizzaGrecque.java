package com.factory.factorySimple;

import com.factory.abstractions.ingredients.FabriqueIngredientsPizza;
import com.factory.abstractions.pizza.Pizza;

public class PizzaGrecque extends Pizza {

    FabriqueIngredientsPizza fabriqueIngredientsPizza;
    public PizzaGrecque(FabriqueIngredientsPizza fabriqueIngredientsPizza){
        this.fabriqueIngredientsPizza = fabriqueIngredientsPizza;
    }
    @Override
    protected void preparer() {
        System.out.println("Prépration de la pizza  " + nom + "en cours...");
        pate = fabriqueIngredientsPizza.creerPate();
        fromage = fabriqueIngredientsPizza.creerFromage();
        sauce = fabriqueIngredientsPizza.creerSauce();

    }
}
