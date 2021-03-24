package com.factory.factorySimple;

import com.factory.abstractions.ingredients.Pate;
import com.factory.abstractions.pizza.Pizza;
import com.factory.implementationsIngredients.ingredients.PateSoufflee;
import com.factory.implementationsIngredients.regions.FabriqueIngredientsPizzaBrest;

public class SimplePizzaFactory {
    public Pizza CreerPizza(String type){
        Pizza pizza = null;
        if(type.equals("fromage")){
            pizza = new PizzaFromage(new FabriqueIngredientsPizzaBrest());
        }
        else if(type.equals("Jambon")){
            pizza = new PizzaJambon();
        }
        else if(type.equals("Grecque")){
            pizza = new PizzaGrecque();
        }
        return pizza;
    }
}
