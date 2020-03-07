package com.peerlabkyiv.di.application.sequenceapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

class ToStringFormatter {

    private String template;

    private Pattern pattern;

    ToStringFormatter() {
        template = "$0";
        pattern = Pattern.compile(".+");
    }

    ToStringFormatter(String template, String pattern) {
        this.template = template;
        this.pattern = Pattern.compile(pattern);
    }

    public String format(int value) {
        return pattern.matcher(String.valueOf(value)).replaceAll(template);
    }
}
