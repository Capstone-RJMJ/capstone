package com.rjmj.capstone.character;

import java.util.Scanner;

public class John implements Character {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() {
        System.out.println("What is AWS' DNS Service ");
        System.out.println("A. S3");
        System.out.println("B. EC2");
        System.out.println("C. Route 53");
        System.out.println("D. Lambda");

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
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
