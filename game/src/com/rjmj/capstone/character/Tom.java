package com.rjmj.capstone.character;

import java.util.Scanner;

public class Tom implements Character {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() {
        System.out.println("What Online video game did Tom perform a wedding?");
        System.out.println("A. Dungeons and Dragons");
        System.out.println("B. World of Warcraft");
        System.out.println("C. Diablo II");
        System.out.println("D. Elder Scrolls");

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (questionAnswer.toUpperCase().equals("B")) {
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
        return "Blue Liquid";
    }
}
