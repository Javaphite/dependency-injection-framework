package com.peerlabkyiv.di.application.fizzbuzz;

import com.peerlabkyiv.di.application.fizzbuzz.components.FizzBuzzService;

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
