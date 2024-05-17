package com.domaci;

public class Kvadrat implements Oblik{
    private double duzinaStranice;

    public Kvadrat(double duzinaStranice) {
        this.duzinaStranice = duzinaStranice;
    }

    @Override
    public double obim() {
        return 4 * duzinaStranice;
    }

    @Override
    public double povrsina() {
        return duzinaStranice * duzinaStranice;
    }
}
