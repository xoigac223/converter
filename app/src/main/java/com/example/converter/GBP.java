package com.example.converter;

public class GBP extends Money {
    private double gbp;

    public GBP(double gpb){
        super(gpb/Money.usd_to_gbp, "GBP");
        this.gbp = gpb;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }
}
