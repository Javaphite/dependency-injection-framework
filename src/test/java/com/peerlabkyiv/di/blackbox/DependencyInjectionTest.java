package com.peerlabkyiv.di.blackbox;

import com.peerlabkyiv.di.application.fizzbuzz.common.FileHelper;
import com.peerlabkyiv.di.application.fizzbuzz.nodi.NoDIFizzBuzzApp;
import com.peerlabkyiv.di.application.fizzbuzz.spring.SpringAnnotationFizzBuzzApp;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class DependencyInjectionTest {

    private File noDiResults;

    private File springResults;

    @Before
    public void setUp() {
        NoDIFizzBuzzApp.main(new String[0]);
        SpringAnnotationFizzBuzzApp.main(new String[0]);

        noDiResults = FileHelper.getResultsFile(FileHelper.NODI_FILENAME);
        springResults = FileHelper.getResultsFile(FileHelper.SPRING_FILENAME);
    }

    @Test
    public void checkAllResultsAreEqual() throws IOException {
        assertTrue(FileUtils.contentEquals(noDiResults, springResults));

        // More assertions here, use No-DI results as target:
        // assertTrue(FileUtils.contentEquals(noDiResults, ourDiResults));
    }

    @After
    public void tearDown() {
        noDiResults.delete();
        springResults.delete();
    }
}
