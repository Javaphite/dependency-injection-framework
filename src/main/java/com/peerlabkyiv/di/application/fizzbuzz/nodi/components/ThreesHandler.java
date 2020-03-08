package com.peerlabkyiv.di.application.fizzbuzz.nodi.components;

public class ThreesHandler implements FizzBuzzHandler {

    @Override
    public String handle(int i) {
        return (i % 3 == 0) ? "Fizz" : "";
    }
}
