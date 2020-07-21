package com.rjmj.capstone.character;

import java.util.Scanner;

public class Tom implements Character {

    @Override
    public void talk() {

    }

    @Override
    public String askQuestion() {
        String result = "";
        System.out.println("What Online video game did Tom perform a wedding?");
        System.out.println("A. Dungeons and Dragons");
        System.out.println("B. World of Warcraft");
        System.out.println("C. Diablo II");
        System.out.println("D. Elder Scrolls");

        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (answer.toUpperCase().equals("B")) {
            System.out.println("Correct");
            result = "Blue Liquid";
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
