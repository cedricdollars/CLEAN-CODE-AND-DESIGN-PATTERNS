package com.singleton;

import java.util.UUID;

public class CoffeeMaker {
    private boolean estPlein;
    private volatile static CoffeeMaker instance;
    private CoffeeMaker() {
        estPlein = false;
    }
    public static CoffeeMaker getInstance()  {
        if(instance == null) {
            synchronized (CoffeeMaker.class){
                if(instance == null){
                    instance = new CoffeeMaker();
                    System.out.println("unique instance " );
                }
            }
        }
        return instance;
    }
    public void remplir(){
        estPlein = true;
    }
}
