package com.strategy;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Canard proto = new PrototypeCanard();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();
    }
}
