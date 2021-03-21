package com.observator;

public class AffichageCondition implements Observateur, Affichage{
    private float temperature;
    private float humidite;
    private Sujet donneesMeteos;

    public AffichageCondition(Sujet donneesMeteos){
        this.donneesMeteos = donneesMeteos;
        donneesMeteos.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        System.out.println("Conditions actuelles : " + temperature + "°C" + " de température " +
                "et " + humidite + "% d'humidité");
    }

    @Override
    public void actualiser(float temperature, float pression, float humidite) {
        this.temperature = temperature;
        this.humidite = humidite;
        afficher();
    }
}
