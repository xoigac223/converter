package com.example.converter;

public class USD extends Money {
    private double usd;

    public USD(double usd){
        super(usd, "USD");
        this.usd = usd;
    }

    @Override
    public double getUsd() {
        return usd;
    }

    @Override
    public void setUsd(double usd) {
        this.usd = usd;
    }
}
