package com.commande;

public class Serveuse {
    String nom;
    String dateEmbauche;
    public Serveuse(String nom, String dateEmbauche){
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
    }
    void prendreCommande(ICommande commande){
        commande.executer();
    }

}
