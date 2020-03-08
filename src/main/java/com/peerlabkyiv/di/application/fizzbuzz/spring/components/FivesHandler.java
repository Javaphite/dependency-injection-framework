package com.peerlabkyiv.di.application.fizzbuzz.spring.components;

import org.springframework.stereotype.Component;

@Component("fivesHandler")
public class FivesHandler implements FizzBuzzHandler {

    @Override
    public String handle(int i) {
        return (i % 5 == 0) ? "Buzz" : "";
    }
}
