package com.peerlabkyiv.di.application.sequenceapp;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component("versionSequenceService")
public class VersionSequenceService {

    @Inject
    @Named("versionSequenceGenerator")
    private SequenceGenerator versionGenerator;

    @Inject
    private ToStringFormatter versionFormatter;

    public String getNextValue() {
        return versionFormatter.format(versionGenerator.generateNext());
    }
}
