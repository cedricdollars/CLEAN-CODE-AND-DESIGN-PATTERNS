package com.decorator;

public class Columbia extends Boisson{


    public Columbia() {
        description = "Colombia";
    }

    @Override
    public double cout() {
        return 0.89;
    }

}
