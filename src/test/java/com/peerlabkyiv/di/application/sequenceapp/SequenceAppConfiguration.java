package com.peerlabkyiv.di.application.sequenceapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.peerlabkyiv")
public class SequenceAppConfiguration {

    @Bean(name="versionSequenceGenerator")
    public SequenceGenerator getVersionSequenceGenerator() {
        return new VersionSequenceGenerator();
    }

    @Bean
    @Scope("prototype")
    public ToStringFormatter getVersionSequenceFormatter() {
        return new ToStringFormatter("v$0.0",".+");
    }
}
