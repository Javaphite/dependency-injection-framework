package com.peerlabkyiv.di.context;

import java.util.List;

/**
 * Implement me
 */
public class AnnotationProcessingBasedContext implements Context {

    @Override
    public Object getComponent(String name) {
        return null;
    }

    @Override
    public List<String> getComponentAliases(String name) {
        return null;
    }

    @Override
    public boolean containsComponent(String name) {
        return false;
    }

    @Override
    public boolean isSingleton(String name) {
        return false;
    }

    @Override
    public boolean isPrototype(String name) {
        return false;
    }
}
