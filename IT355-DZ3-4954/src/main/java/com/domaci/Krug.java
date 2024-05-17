package com.domaci;

public class Krug implements Oblik {
    private double poluprecnik;
    public Krug(double poluprecnik) {
        if (poluprecnik <= 0) {
            throw new IllegalArgumentException("Poluprecnik mora biti pozitivan broj");
        }
        this.poluprecnik = poluprecnik;
    }
    @Override
    public double obim() {
        return 2 * Math.PI * poluprecnik;
    }

    @Override
    public double povrsina() {
        return Math.PI * poluprecnik * poluprecnik;
    }
}
