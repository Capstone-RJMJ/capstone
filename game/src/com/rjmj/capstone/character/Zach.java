package com.rjmj.capstone.character;

import java.util.Scanner;

public class Zach implements Character{
    private String questionAnswer;

    @Override
    public void askTheQuestionAndCollectInput() {
        System.out.println("What did the crew name the Dragon DEMO 2 capsule?");
        System.out.println("A. Endeavor");
        System.out.println("B. Atlantis");
        System.out.println("C. Dragon");
        System.out.println("D. Enterprise");

        Scanner sc = new Scanner(System.in);
        processQuestionAnswer(sc.next());
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (getQuestionAnswer().toUpperCase().equals("A")) {
            System.out.println("Correct");
            result = "Recipe";
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
}
