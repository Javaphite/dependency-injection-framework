package com.peerlabkyiv.di.application.fizzbuzz;

import com.peerlabkyiv.di.application.fizzbuzz.components.FizzBuzzService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class SpringAnnotationFizzBuzzApp {

    public static void main(String[] args) throws IOException {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class)) {
            context.getBean("fizzBuzzService", FizzBuzzService.class).simulate("spring");
        }
    }
}
