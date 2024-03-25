package com.domaci;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public Oblik kvadrat(){
        return new Kvadrat(5);
    }
    @Bean
    public Oblik krug(){
        return new Krug(3);

    }
    @Bean
    public Oblik jstTrougao(){
        return new JSTTrougao(4);

    }
    @Bean
    public OblikService oblikService(Oblik kvadrat, Oblik krug, Oblik jstTrougao){
        return new OblikService(kvadrat, krug, jstTrougao);
    }
}
