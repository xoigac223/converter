package com.example.converter;

public class Money {
    private double usd;
    private final String symbol;

    protected static double usd_to_vnd = 23221.17;
    protected static double usd_to_eur = 0.84;
    protected static double usd_to_cny = 6.69;
    protected static double usd_to_gbp = 0.77;
    protected static double usd_to_jpy = 104.689;
    protected static double usd_to_rub = 76.1265;
    protected static double usd_to_krw = 1128.59;
    protected static double usd_to_sgd = 1.35813;
    protected static double usd_to_inr = 73.8939;


    public Money(double usd, String symbol){
        this.usd = usd;
        this.symbol = symbol;

    }

    public double toUSD(){
        return this.usd;
    }

    public double toVND(){
        return this.usd * usd_to_vnd;
    }
    public double toEUR(){
        return this.usd * usd_to_eur;
    }
    public double toCNY(){
        return this.usd * usd_to_cny;
    }
    public double toGBP(){
        return this.usd * usd_to_gbp;
    }
    public double toJPY(){
        return this.usd * usd_to_jpy;
    }
    public double toRUB(){
        return this.usd * usd_to_rub;
    }
    public double toKRW(){
        return this.usd * usd_to_krw;
    }
    public double toSGD(){
        return this.usd * usd_to_sgd;
    }
    public double toINR(){
        return this.usd * usd_to_inr;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public String getSymbol() {
        return symbol;
    }

    public double toMoney(String symbol){
        if (symbol.equals("USD")) return toUSD();
        if (symbol.equals("CNY")) return toCNY();
        if (symbol.equals("EUR")) return toEUR();
        if (symbol.equals("GBP")) return toGBP();
        if (symbol.equals("INR")) return toINR();
        if (symbol.equals("JPY")) return toJPY();
        if (symbol.equals("KRW")) return toKRW();
        if (symbol.equals("RUB")) return toRUB();
        if (symbol.equals("SGD")) return toSGD();
        if (symbol.equals("VND")) return toVND();
        return 0;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
