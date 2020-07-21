package com.rjmj.capstone.character;

import java.util.Scanner;

public class Tom implements Character {
    private String questionAnswer;

    @Override
    public void askTheQuestionAndCollectInput() {
        System.out.println("What Online video game did Tom perform a wedding?");
        System.out.println("A. Dungeons and Dragons");
        System.out.println("B. World of Warcraft");
        System.out.println("C. Diablo II");
        System.out.println("D. Elder Scrolls");

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (getQuestionAnswer().toUpperCase().equals("B")) {
            System.out.println("Correct");
            result = "Blue Liquid";
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
