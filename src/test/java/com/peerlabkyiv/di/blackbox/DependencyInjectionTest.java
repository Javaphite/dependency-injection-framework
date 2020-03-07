package com.peerlabkyiv.di.blackbox;

import com.peerlabkyiv.di.application.fizzbuzz.NoDIFizzBuzzApp;
import com.peerlabkyiv.di.application.fizzbuzz.SpringAnnotationFizzBuzzApp;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class DependencyInjectionTest {

    File noDiResults;

    File springResults;

    @BeforeEach
    public void setUp() throws IOException {
        NoDIFizzBuzzApp.main(new String[0]);
        SpringAnnotationFizzBuzzApp.main(new String[0]);

        noDiResults = new File(FileUtils.getTempDirectoryPath() + "/" + "nodi");
        springResults = new File(FileUtils.getTempDirectoryPath() + "/" + "spring");
    }

    @Test
    public void checkAllResultsAreEqual() throws IOException {
        Assertions.assertTrue(FileUtils.contentEquals(noDiResults, springResults));

        // More assertions here, use No-DI results as targeted
    }

    @AfterEach
    public void tearDown() {
        noDiResults.delete();
        springResults.delete();
    }
}
