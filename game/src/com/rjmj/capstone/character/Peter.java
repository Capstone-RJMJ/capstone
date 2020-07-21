package com.rjmj.capstone.character;

import java.util.Scanner;

public class Peter implements Character {

    @Override
    public void talk() {

    }

    @Override
    public String askQuestion() {
        String result = "";
        System.out.println("How many possible permeations of the vaccine are there if each ingredient is used once?");
        System.out.println("A. 3");
        System.out.println("B. 27");
        System.out.println("C. 9");
        System.out.println("D. 6");

        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        System.out.println(answer);
        if (answer.toUpperCase().equals("D")) {
            System.out.println("Correct");
            result = null; //TODO link to Access from library;
        } else {
            System.out.println("Incorrect, please try again.");
            askQuestion();
        }
        return result;
    }

    @Override
    public void answerQuestion() {

    }
}