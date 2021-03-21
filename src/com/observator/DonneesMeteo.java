package com.observator;

import java.util.ArrayList;


public class DonneesMeteo implements Sujet  {
    private ArrayList observateurs;
    private float temperature;
    private float pression;
    private float humidite;

    public DonneesMeteo() {
        observateurs = new ArrayList();
    }

    public void setMesures(float temperature, float pression, float humidite) {
        this.temperature = temperature;
        this.pression = pression;
        this.humidite = humidite;
        actualiserMesures();
    }

    public void actualiserMesures() {
        notifierObservateurs();
    }


    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur o){
        int index = observateurs.indexOf(o);
        if (index > -1){
            observateurs.remove(index);
        }
    }

    @Override
    public void notifierObservateurs() {
        for (int i = 0; i < observateurs.size(); i++){
            Observateur observateur = (Observateur) observateurs.get(i);
            observateur.actualiser(temperature, pression, humidite);
        }
    }
}

