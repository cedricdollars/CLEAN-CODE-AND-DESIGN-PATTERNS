package com.factory.implementationsIngredients.regions;

import com.factory.abstractions.ingredients.*;
import com.factory.implementationsIngredients.ingredients.*;

public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {
    @Override
    public Pate creerPate() {
        return new PateSoufflee();
    }

    @Override
    public Sauce creerSauce() {
        return new SauceMarina();
    }

    @Override
    public Fromage creerFromage() {
        return new Reggiano();
    }

    @Override
    public Legume[] creerLegumes() {
        Legume legume []={
                new Ail(),
                new Oignon(),
                new Champignon(),
                new PoivronRouge()
        };
        return legume;
    }

    @Override
    public Poivron creerPoivrons() {
        return null;
    }
}
