package com.commande;

public class CommandeImprimer implements ICommande {
    Imprimante imprimante;
    public CommandeImprimer(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    @Override
    public void executer() {
        imprimante.marche();
    }
}
