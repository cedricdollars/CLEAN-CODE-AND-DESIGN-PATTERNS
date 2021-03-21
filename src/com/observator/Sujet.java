package com.observator;

public interface Sujet {
   void enregistrerObservateur(Observateur observateur);
   void supprimerObservateur(Observateur observateur);
   void notifierObservateurs();
}
