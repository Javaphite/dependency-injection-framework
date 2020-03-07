package com.peerlabkyiv.di.application.sequenceapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SequenceApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceAppConfiguration.class);
        VersionSequenceService service =
                context.getBean("versionSequenceService", VersionSequenceService.class);

        System.out.println("Generated version: " + service.getNextValue());
    }

}
