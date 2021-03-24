package com.factory.abstractions.ingredients;

public abstract class Pate {
    protected Long dosage;
    protected String nomPate;

    public Long getDosage() {
        return dosage;
    }

    public String getNom() {
        return nomPate;
    }
}
