package com.peerlabkyiv.di.application.fizzbuzz.spring.components;

import org.springframework.stereotype.Component;

@Component
@FunctionalInterface
public interface FizzBuzzHandler {

    String handle(int i);
}
