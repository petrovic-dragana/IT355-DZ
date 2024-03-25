package com.domaci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OblikService oblikService = context.getBean(OblikService.class);
        oblikService.prikaziInformacije();
        context.close();
    }
}