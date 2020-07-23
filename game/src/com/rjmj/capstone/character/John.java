package com.rjmj.capstone.character;

import java.util.Scanner;

public class John implements Character {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() throws InterruptedException {
        String[] johnInput = {
                ANSI_CYAN,
                "What is AWS' DNS Service?",
                "A. S3",
                "B. EC2",
                "C. Route 53",
                "D. Lambda",
                ANSI_RESET
        };

        for (String john : johnInput) {
            Thread.sleep(1000);
            System.out.println(john);
        }

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) throws InterruptedException {
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
        return "Key";
    }
}
