package com.singleton;

import java.util.UUID;

public class Main {
    public static void main(String[] agrs){
        //test our singleton
         UUID uuid = UUID.randomUUID();
         System.out.println("instance : "+ uuid +CoffeeMaker.getInstance());
         System.out.println("instance : "+ uuid +CoffeeMaker.getInstance());
         System.out.println("instance : "+ uuid +CoffeeMaker.getInstance());
    }
}
