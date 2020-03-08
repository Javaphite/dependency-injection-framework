package com.peerlabkyiv.di.application.fizzbuzz.nodi.components;

public class FivesHandler implements FizzBuzzHandler {

    @Override
    public String handle(int i) {
        return (i % 5 == 0) ? "Buzz" : "";
    }
}
