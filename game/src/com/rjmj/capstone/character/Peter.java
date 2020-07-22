package com.rjmj.capstone.character;

import java.util.Scanner;

public class Peter implements Character {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() {
        System.out.println("How many possible versions of the vaccine are there if each ingredient is used once?");
        System.out.println("A. 3");
        System.out.println("B. 27");
        System.out.println("C. 9");
        System.out.println("D. 6");

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (questionAnswer.toUpperCase().equals("D")) {
            System.out.println("Correct");
            // TODO: Make this return a value that is not Null - Needs to be updated later.
            result = null;
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