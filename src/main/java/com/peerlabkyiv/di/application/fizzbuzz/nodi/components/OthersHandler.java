package com.peerlabkyiv.di.application.fizzbuzz.nodi.components;

public class OthersHandler implements FizzBuzzHandler {

    @Override
    public String handle(int i) {
        return (i%3==0 || i%5==0)? "": String.valueOf(i);
    }
}
