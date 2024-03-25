package com.domaci;

import org.springframework.stereotype.Service;

@Service
public class OblikService {
    private final Oblik kvadrat;
    private final Oblik krug;
    private final Oblik jstTrougao;

    public OblikService(Oblik kvadrat, Oblik krug, Oblik jstTrougao) {
        this.kvadrat = kvadrat;
        this.krug = krug;
        this.jstTrougao = jstTrougao;
    }
    public void prikaziInformacije() {
        System.out.println("Kvadrat:");
        System.out.println("Obim: " + kvadrat.obim());
        System.out.println("Površina: " + kvadrat.povrsina());

        System.out.println("Krug:");
        System.out.println("Obim: " + krug.obim());
        System.out.println("Površina: " + krug.povrsina());

        System.out.println("Jednakostranični Trougao:");
        System.out.println("Obim: " + jstTrougao.obim());
        System.out.println("Površina: " + jstTrougao.povrsina());
    }
}
