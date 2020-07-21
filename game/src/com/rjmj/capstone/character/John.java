package com.rjmj.capstone.character;

import java.util.Scanner;

public class John implements Character {

    @Override
    public String askTheQuestionAndCollectInput() {
        System.out.println("What is AWS' DNS Service ");
        System.out.println("A. S3");
        System.out.println("B. EC2");
        System.out.println("C. Route 53");
        System.out.println("D. Lambda");

        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (questionAnswer.toUpperCase().equals("C")) {
            System.out.println("Correct");
            result = "Key";
        } else {
            System.out.println("Incorrect, please try again.");
            processQuestionAnswer(questionAnswer);
        }
        return result;
    }

}
