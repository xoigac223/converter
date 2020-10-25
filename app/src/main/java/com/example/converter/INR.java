package com.example.converter;

public class INR extends Money {
    private double inr;

    public INR(double inr){
        super(inr/Money.usd_to_inr, "INR");
        this.inr = inr;
    }
}
