package com.domaci;

public class JSTTrougao implements Oblik {
    private double duzinaStranice;

    public JSTTrougao(double duzinaStranice) {
        if (duzinaStranice <= 0) {
            throw new IllegalArgumentException("Duzina stranice mora biti pozitivan broj");
        }
        this.duzinaStranice = duzinaStranice;
    }

    @Override
    public double obim() {
        return 3 * duzinaStranice;
    }

    @Override
    public double povrsina() {
        return (Math.sqrt(3) / 4) * duzinaStranice * duzinaStranice;
    }
}
