package com.strategy;

public class Canard {
    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public Canard() {}

    public void effectuerVol(){
        comportementVol.voler();

    }
    public void effectuerCancan() {
        comportementCancan.cancan();
        System.out.println("Couincouin");
    }
    public void nager() {
        System.out.println("Tous les canard flottent");
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }
}
