package com.rjmj.capstone.character;

import java.io.IOException;
import java.util.Scanner;

public class Tom implements Character {
    private final String name = "Tom";

    // TODO: Update with the correct question.
    private final String question = null;

    // TODO: Update with correct room assignment.
    private final String room = null;


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
            System.out.println(answer);
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
