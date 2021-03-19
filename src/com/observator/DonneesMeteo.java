package com.observator;

public class DonneesMeteo {
    private float temperature;
    private float pression;
    private float humidite;

    public DonneesMeteo(int temperature, int pression, int humidite) {
        this.temperature = temperature;
        this.pression = pression;
        this.humidite = humidite;
    }

    public float getTemperature(){
        return temperature ;
    }
    public float getHumidite() {
        return humidite;
    }
    public float getPression() {
       return pression;
    }

    public void actualiserMesures() {
        float temperature = getTemperature();
        float pression = getPression();
        float humidite = getHumidite();
    }
}
