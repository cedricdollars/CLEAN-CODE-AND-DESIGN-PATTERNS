package com.observator;

public class Main {

    public static void main(String[] agrs) {
        // write your code here
        DonneesMeteo donneesMeteo = new DonneesMeteo();
        AffichageCondition affichageStats = new AffichageCondition(donneesMeteo);


        donneesMeteo.setMesures(25, 13, 1021);

        donneesMeteo.setMesures(20, 11, 1024);
        donneesMeteo.setMesures(15, 10, 1022);
    }
}
