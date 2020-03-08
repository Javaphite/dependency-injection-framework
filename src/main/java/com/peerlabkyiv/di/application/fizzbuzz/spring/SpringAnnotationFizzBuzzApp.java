package com.peerlabkyiv.di.application.fizzbuzz.spring;

import com.peerlabkyiv.di.application.fizzbuzz.common.FileHelper;
import com.peerlabkyiv.di.application.fizzbuzz.spring.components.FizzBuzzService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationFizzBuzzApp {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(SpringAppConfig.class)) {
            context.getBean("fizzBuzzService", FizzBuzzService.class)
                    .simulate(FileHelper.SPRING_FILENAME);
        }
    }
}
