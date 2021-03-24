package com.factory.implementationsRegionales;

import com.factory.abstractions.ingredients.FabriqueIngredientsPizza;
import com.factory.abstractions.pizza.Pizza;
import com.factory.abstractions.pizza.Pizzeria;
import com.factory.factorySimple.PizzaFromage;
import com.factory.factorySimple.PizzaGrecque;
import com.factory.factorySimple.PizzaJambon;
import com.factory.implementationsIngredients.regions.FabriqueIngredientsPizzaBrest;

public class PizzeriaBrest extends Pizzeria {

    @Override
    protected Pizza creerPizza(String type) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaBrest();
       switch (type){
           case "fromage":
               pizza = new PizzaFromage(fabriqueIngredients);
               pizza.setNom("Pizza au fromage style Brest");
           case "Jambon":
                pizza =  new PizzaJambon(fabriqueIngredients);
                pizza.setNom("Pizza au jambon style Brest");
           case "grecque":
                pizza = new PizzaGrecque(fabriqueIngredients);
                pizza.setNom("Pizza grecque style Brest");
           default:
               return pizza;
       }
    }
}
