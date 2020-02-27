package com.peerlabkyiv.di.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class SpringApplicationContextAdapter implements Context {

    private ApplicationContext springContext = new AnnotationConfigApplicationContext();

    @Override
    public Object getComponent(String name) {
        return springContext.getBean(name);
    }

    @Override
    public List<String> getComponentAliases(String name) {
        return Arrays.asList(springContext.getAliases(name));
    }

    @Override
    public boolean containsComponent(String name) {
        return springContext.containsBean(name);
    }
}
