package com.peerlabkyiv.di.application.fizzbuzz.nodi;

import com.peerlabkyiv.di.application.fizzbuzz.common.FileHelper;
import com.peerlabkyiv.di.application.fizzbuzz.nodi.components.FivesHandler;
import com.peerlabkyiv.di.application.fizzbuzz.nodi.components.FizzBuzzService;
import com.peerlabkyiv.di.application.fizzbuzz.nodi.components.OthersHandler;
import com.peerlabkyiv.di.application.fizzbuzz.nodi.components.ThreesHandler;

public class NoDIFizzBuzzApp {

    public static void main(String[] args) {
        FizzBuzzService service = new FizzBuzzService();
        service.setFivesHandler(new FivesHandler());
        service.setThreesHandler(new ThreesHandler());
        service.setOthersHandler(new OthersHandler());

        service.simulate(FileHelper.NODI_FILENAME);
    }
}
