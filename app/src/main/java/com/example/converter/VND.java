package com.example.converter;

public class VND extends Money {
    private double vnd;

    public VND(double vnd){
        super(vnd / Money.usd_to_vnd , "VND");
        this.vnd = vnd;
    }

    public double getVnd() {
        return vnd;
    }

    public void setVnd(double vnd) {
        this.vnd = vnd;
    }
}
