package com.rjmj.capstone.character;

import java.util.Scanner;

public class Nelly implements Character {
    private String questionAnswer;

    @Override
    public void askTheQuestionAndCollectInput() {
        System.out.println("Welcome to the Apprenticeship!  Your journey has been hard, but I will help you");
        System.out.println("You have been intentionally injected with CoVID.  Luckily the vaccine ingredients");
        System.out.println("are located in this Mansion.  If you fail to properly mix and administer the vaccine");
        System.out.println("within 10 minutes you will die.");
        System.out.println("To move around, you simply will type 'Up' 'Back' 'Left' and 'Right' as applicable.");
        System.out.println("To get you started here is a Syringe.  You will need to find the remaining items");
        System.out.println("Type Start if you are ready to get started.");
        Scanner sc = new Scanner(System.in);
        processQuestionAnswer(sc.next());
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        String result = "";
        if (questionAnswer.toUpperCase().equals("START")) {
            askTheQuestionAndCollectInput();
            System.out.println("Good Luck");
            result = "Syringe";
        } else {
            System.out.println("To Bad");
            System.exit(1);
        }
        return result;
    }
}
