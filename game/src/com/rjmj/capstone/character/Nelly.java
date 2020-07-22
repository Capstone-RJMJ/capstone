package com.rjmj.capstone.character;

import java.util.Scanner;

public class Nelly implements Character {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() {
        System.out.println("To get you started here is a Syringe.  You will need to find the remaining items.");
        System.out.println("Once you have all of the items required, the mix command will become available for you.");
        System.out.println("Type Start or any other entry if you are ready to get started.");
        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        System.out.println("Good Luck");
        return getItem();
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getItem() {
        return "Syringe";
    }
}
