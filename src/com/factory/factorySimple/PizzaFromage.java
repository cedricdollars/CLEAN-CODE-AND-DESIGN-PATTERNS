package com.factory.factorySimple;

import com.factory.abstractions.ingredients.FabriqueIngredientsPizza;
import com.factory.abstractions.ingredients.Fromage;
import com.factory.abstractions.ingredients.Pate;
import com.factory.abstractions.ingredients.Sauce;
import com.factory.abstractions.pizza.Pizza;

public class PizzaFromage extends Pizza {

    FabriqueIngredientsPizza fabriqueIngredientsPizza;
    public PizzaFromage(FabriqueIngredientsPizza fabriqueIngredientsPizza){
        this.fabriqueIngredientsPizza = fabriqueIngredientsPizza;
    }

    @Override
    protected void preparer() {
        System.out.println("Préparation de " + nom);
         pate = fabriqueIngredientsPizza.creerPate();
         sauce = fabriqueIngredientsPizza.creerSauce();
         fromage = fabriqueIngredientsPizza.creerFromage();
    }
}
