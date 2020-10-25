package com.example.converter;

public class EUR extends Money {
    private double eur;

    public EUR(double eur){
        super(eur/Money.usd_to_eur, "EUR");
        this.eur = eur;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }
}
