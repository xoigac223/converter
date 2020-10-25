package com.example.converter;

public class CNY extends Money {
    private double cny;

    public CNY(double cny){
        super(cny/Money.usd_to_cny, "CNY");
        this.cny = cny;
    }

    public double getCny() {
        return cny;
    }

    public void setCny(double cny) {
        this.cny = cny;
    }
}
