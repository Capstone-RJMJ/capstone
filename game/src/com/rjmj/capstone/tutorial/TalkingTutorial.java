package com.rjmj.capstone.tutorial;

import java.util.Scanner;

public class TalkingTutorial {
    private Scanner userInput = new Scanner(System.in);

    public void startTalkingTutorial() throws InterruptedException {
        tutorialIntroductionDisplay();
        talkingTutorialPrompt();
        talkingTutorialDisplay(talkingTutorialInputCollection());
    }

    private void tutorialIntroductionDisplay() throws InterruptedException {
        String[] tutorialIntroText = {
                "Hello there, welcome to the Apprenticeship Tutorial!",
                "This tutorial will guide you through the basics of the game, how items work, and the general rules.",
                "To get started, go ahead and type \"Start\" or any other command you prefer."
        };

        for (String introText : tutorialIntroText) {
            Thread.sleep(700);
            System.out.println(introText);
        }

        // This is just here to prompt the next action, no logic is done with the collected input.
        userInput.next();
    }

    private void talkingTutorialPrompt() throws InterruptedException {
        String[] talkingTutorialText = {
                "First up, lets learn how to talk to the various characters you will discover throughout the game.",
                "This is pretty simple, just type \"Talk\" in the prompt to start a conversation with the available character.",
                "Please note if there is no character in your current room, you will be unable to start a conversation."
        };

        for (String talkingText : talkingTutorialText) {
            Thread.sleep(700);
            System.out.println(talkingText);
        }
    }

    private String talkingTutorialInputCollection() {
        return userInput.next().toUpperCase();
    }

    private void talkingTutorialDisplay(String input) throws InterruptedException {
        if (input.equals("TALK")) {
            System.out.println("Jeannette: \"Hello there!  You did it.  Please type \"Next\" when you are ready, " +
                    "or any other command you prefer to proceed to the next tutorial area.\"");

            // This is just here to prompt the next action, lno logic is done with the collected input.
            userInput.next();
        } else {
            System.out.println("Sorry, invalid command entry, please try again using \"Talk\"");
            talkingTutorialDisplay(talkingTutorialInputCollection());
        }
    }
}
