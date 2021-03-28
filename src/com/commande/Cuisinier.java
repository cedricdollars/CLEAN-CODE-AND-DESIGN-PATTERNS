package com.commande;

public class Cuisinier implements ICuisinier {

    public Cuisinier(){}
    @Override
    public void prepareRepas() {
         faireHamburger();
         faireMilshake();
    }
    public void faireHamburger(){
        System.out.println("Hamburger en préparation");
    }
    public void faireMilshake() {
        System.out.println("Milshake en préparation");
    }
}
