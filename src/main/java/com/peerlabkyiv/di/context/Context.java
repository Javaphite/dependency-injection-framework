package com.peerlabkyiv.di.context;

import java.util.List;

public interface Context {

    Object getComponent(String name);

    List<String> getComponentAliases(String name);

    boolean containsComponent(String name);
}
