package com.peerlabkyiv.di.application.fizzbuzz;

import com.peerlabkyiv.di.application.fizzbuzz.components.FivesHandler;
import com.peerlabkyiv.di.application.fizzbuzz.components.FizzBuzzService;
import com.peerlabkyiv.di.application.fizzbuzz.components.OthersHandler;
import com.peerlabkyiv.di.application.fizzbuzz.components.ThreesHandler;

import java.io.IOException;

public class NoDIFizzBuzzApp {

    public static void main(String[] args) throws IOException {
        FizzBuzzService service = new FizzBuzzService();
        service.setFivesHandler(new FivesHandler());
        service.setThreesHandler(new ThreesHandler());
        service.setOthersHandler(new OthersHandler());

        service.simulate("nodi");
    }
}
