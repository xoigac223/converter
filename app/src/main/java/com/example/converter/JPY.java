package com.example.converter;

public class JPY extends Money {
    private double jpg;

    public JPY(double jpg){
        super(jpg/Money.usd_to_jpy, "JPG");
        this.jpg = jpg;
    }

    public double getJpg() {
        return jpg;
    }

    public void setJpg(double jpg) {
        this.jpg = jpg;
    }
}
