package com.peerlabkyiv.di.application.fizzbuzz.spring;

import com.peerlabkyiv.di.application.fizzbuzz.spring.components.FizzBuzzService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringAppConfig {

    @Bean
    public FizzBuzzService getFizzBuzzService() {
        return new FizzBuzzService();
    }

}
