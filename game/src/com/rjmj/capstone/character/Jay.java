package com.rjmj.capstone.character;


import java.io.IOException;
import java.util.Scanner;


public class Jay implements Character {


    private final String name = "Jay";

    // TODO: Update with the correct question.
    private final String question = null;

    // TODO: Update with correct room assignment.
    private final String room = "Movie Room";


    @Override
    public void talk() {

    }


    @Override
    public String askQuestion() throws IOException {
        String result = "";
        String url_open = "https://www.youtube.com/watch?v=hyctW2abkY4";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        System.out.println("What band is Jay playing in this video?");
        System.out.println("A. Aerosmith");
        System.out.println("B. Daft Punk");
        System.out.println("C. Queen");
        System.out.println("D. Judas Priest");

        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (answer.toUpperCase().equals("C")) {
            System.out.println("Correct");
            result = "Red Liquid";
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
