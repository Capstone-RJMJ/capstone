package com.rjmj.capstone.character;

import java.util.Scanner;

public class Zach implements Character{
    private final String name = "Zach";

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
        System.out.println("What did the crew name the Dragon DEMO 2 capsule?");
        System.out.println("A. Endeavor");
        System.out.println("B. Atlantis");
        System.out.println("C. Dragon");
        System.out.println("D. Enterprise");

        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        System.out.println(answer);
        if (answer.toUpperCase().equals("A")) {
            System.out.println("Correct");
            result = "Recipe";
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
