package com.example.converter;

public class RUB extends Money {
    private double rub;

    public RUB(double rub){
        super(rub/Money.usd_to_rub, "RUB");
        this.rub = rub;
    }

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }
}
