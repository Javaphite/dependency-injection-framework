package com.peerlabkyiv.di.application.fizzbuzz.common;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

public final class FileHelper {

    public static final String NODI_FILENAME = "nodi";

    public static final String SPRING_FILENAME = "spring";

    public static final String BYTECODE_INSTRUMENTATION_FILENAME = "bytecode";

    public static final String REFLECTION_BASED_FILENAME = "reflection";

    public static void createResultsFile(String filename, String content) {
        try {
            File file = new File(FileUtils.getTempDirectoryPath() + "/" + filename);
            FileUtils.write(file, content, "UTF8");
            System.out.println("RESULTS SAVED TO:" + file.getAbsolutePath());
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }

    public static File getResultsFile(String filename) {
        return new File(FileUtils.getTempDirectoryPath() + "/" + filename);
    }

}
