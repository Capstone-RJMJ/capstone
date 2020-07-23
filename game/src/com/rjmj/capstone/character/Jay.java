package com.rjmj.capstone.character;

import java.io.IOException;
import java.util.Scanner;

public class Jay implements Character {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() throws IOException, InterruptedException {
        String[] jayInput = {
                ANSI_CYAN,
                "What band is Jay playing in this video?",
                "A. Aerosmith",
                "B. Daft Punk",
                "C. Queen",
                "D. Judas Priest",
                ANSI_RESET
        };

        String url_open = "https://www.youtube.com/watch?v=hyctW2abkY4";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));

        for (String jay : jayInput) {
            Thread.sleep(1000);
            System.out.println(jay);
        }

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) throws IOException, InterruptedException {
        String result = "";
        if (questionAnswer.toUpperCase().equals("C")) {
            System.out.println("Correct");
            result = getItem();
        } else {
            System.out.println("Incorrect, please try again.");
            askTheQuestionAndCollectInput();
        }
        return result;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getItem() {
        return "Red Liquid";
    }
}
