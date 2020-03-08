package com.peerlabkyiv.di.application.fizzbuzz.spring.components;

import org.springframework.stereotype.Component;

@Component("threesHandler")
public class ThreesHandler implements FizzBuzzHandler {

    @Override
    public String handle(int i) {
        return (i % 3 == 0) ? "Fizz" : "";
    }
}
