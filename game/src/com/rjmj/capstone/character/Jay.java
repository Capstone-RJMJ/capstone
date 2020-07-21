package com.rjmj.capstone.character;

import java.io.IOException;
import java.util.Scanner;

public class Jay implements Character {

    @Override
    public String askTheQuestionAndCollectInput() throws IOException {
        String url_open = "https://www.youtube.com/watch?v=hyctW2abkY4";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        System.out.println("What band is Jay playing in this video?");
        System.out.println("A. Aerosmith");
        System.out.println("B. Daft Punk");
        System.out.println("C. Queen");
        System.out.println("D. Judas Priest");

        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (questionAnswer.toUpperCase().equals("C")) {
            System.out.println("Correct");
            result = "Red Liquid";
        } else {
            System.out.println("Incorrect, please try again.");
            processQuestionAnswer(questionAnswer);
        }
        return result;
    }
}
