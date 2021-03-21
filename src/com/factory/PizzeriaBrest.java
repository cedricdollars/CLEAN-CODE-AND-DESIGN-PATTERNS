package com.factory;

public class PizzeriaBrest extends Pizzeria{

    @Override
    public Pizza creerPizza(String type) {
       switch (type){
           case "fromage":
              return  new PizzaFromageBrest();
           case "Jambon":
               return new PizzaJambonBrest();

           case "grecque":
               return new PizzaGrecqueBrest();

           default:
               return null;
       }
    }
}
