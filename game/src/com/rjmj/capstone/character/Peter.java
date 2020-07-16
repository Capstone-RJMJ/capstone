package com.rjmj.capstone.character;

import com.rjmj.capstone.room.Rooms;

import java.util.Scanner;

public class Peter implements Character {
    private final String name = "Peter";

    // TODO: Update with the correct question.
    private final String question = "How many possible permeations of the vaccine are there if each ingredient is used once?";

    // TODO: Update with correct room assignment.
    private final String room = "Library";
    private final String answer = "6";
    private boolean isCorrect = false;


    @Override
    public void talk() {

    }

    @Override
    public void askQuestion() {
        String playerAnswer;
        Scanner userInput = new Scanner(System.in);
        System.out.println(this.getQuestion());
        playerAnswer = userInput.nextLine();
        if(playerAnswer.equals(this.getAnswer())){
            System.out.println("That is correct!");
            setCorrect();

        }
        else{
            askQuestion();
        }

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect() {
        isCorrect = true;
    }

    @Override
    public void answerQuestion() {
        if(true){
            //allow access
        } else {
            //do this
        }
        return;

    }
}
