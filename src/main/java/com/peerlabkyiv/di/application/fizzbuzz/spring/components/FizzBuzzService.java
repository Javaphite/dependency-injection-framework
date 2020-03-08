package com.peerlabkyiv.di.application.fizzbuzz.spring.components;

import com.peerlabkyiv.di.application.fizzbuzz.common.FileHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzService {

    @Autowired
    private ThreesHandler threesHandler;

    @Autowired
    private FivesHandler fivesHandler;

    @Autowired
    private OthersHandler othersHandler;

    public void simulate(String saveToFile) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            result.append(getFizzBuzzAnswer(i))
                    .append(System.lineSeparator());
        }
        FileHelper.createResultsFile(saveToFile, result.toString());
    }

    private String getFizzBuzzAnswer(int i) {
        return threesHandler.handle(i)
                + fivesHandler.handle(i)
                + othersHandler.handle(i);
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
