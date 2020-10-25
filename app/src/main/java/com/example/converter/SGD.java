package com.example.converter;

public class SGD extends Money {
    private double sgd;

    public SGD(double sgd){
        super(sgd/Money.usd_to_sgd, "SGD");
        this.sgd = sgd;
    }

    public double getSgd() {
        return sgd;
    }

    public void setSgd(double sgd) {
        this.sgd = sgd;
    }
}
