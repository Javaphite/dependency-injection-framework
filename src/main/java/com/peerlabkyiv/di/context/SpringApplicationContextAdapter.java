package com.peerlabkyiv.di.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class SpringApplicationContextAdapter implements Context {

    private ApplicationContext springContext;

    SpringApplicationContextAdapter() {
        springContext = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) springContext).refresh();
    }

    SpringApplicationContextAdapter(Class<?> configuration) {
        springContext = new AnnotationConfigApplicationContext(configuration);
    }

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

    @Override
    public boolean isSingleton(String name) {
        return springContext.isSingleton(name);
    }

    @Override
    public boolean isPrototype(String name) {
        return springContext.isPrototype(name);
    }
}
