package com.peerlabkyiv.di.application.fizzbuzz.components;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

@Component
public class FizzBuzzService {

    @Autowired
    private ThreesHandler threesHandler;

    @Autowired
    private FivesHandler fivesHandler;

    @Autowired
    private OthersHandler othersHandler;

    public void simulate(String saveToFile) throws IOException {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            result.append(getFizzBuzzAnswer(i))
                    .append(System.lineSeparator());
        }
        writeToFile(saveToFile, result.toString());
    }

    private String getFizzBuzzAnswer(int i) {
        return threesHandler.handle(i)
                + fivesHandler.handle(i)
                + othersHandler.handle(i);
    }

    private void writeToFile(String filename, String content) {
        try {
            File file = new File(FileUtils.getTempDirectoryPath() + "/" + filename);
            System.out.println("RESULTS SAVED TO:" + file.getAbsolutePath());
            FileUtils.write(file, content, "UTF8");
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }

    public void setThreesHandler(ThreesHandler threesHandler) {
        this.threesHandler = threesHandler;
    }

    public void setFivesHandler(FivesHandler fivesHandler) {
        this.fivesHandler = fivesHandler;
    }

    public void setOthersHandler(OthersHandler othersHandler) {
        this.othersHandler = othersHandler;
    }
}
