package com.peerlabkyiv.di.application.sequenceapp;

public class VersionSequenceGenerator implements SequenceGenerator {

    int latestVersion;

    @Override
    public int generateNext() {
        return (++latestVersion);
    }
}
