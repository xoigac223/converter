package com.example.converter;

public class KRW extends Money {
    private double krw;

    public KRW(double krw){
        super(krw/Money.usd_to_krw, "KRW");
        this.krw = krw;
    }

    public double getKrw() {
        return krw;
    }

    public void setKrw(double krw) {
        this.krw = krw;
    }
}
