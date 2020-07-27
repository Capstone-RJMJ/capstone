package com.rjmj.capstone.tutorial;

import java.util.Scanner;

public class MovingTutorial {
    private Scanner userInput = new Scanner(System.in);
    private String playerLocation = "HALL";
    private final int delay = 1000;

    public void startMovingTutorial() throws InterruptedException {
        clearScreenTimeDelay(delay);
        movingTutorialInformationPrompt();
        movementEngine();
    }

    private void movementEngine() throws InterruptedException {

        mapDisplay();
        if (getPlayerLocation().equals("HALL")) {
            System.out.println("Please select a direction to move, you are currently in the " + getPlayerLocation());
            System.out.println("Available Options: Right.");

            if (movingTutorialMovementInputCollection().equals("RIGHT")) {
                setPlayerLocation("BALL ROOM");
                System.out.println("You've entered the Ball Room!\n");
            } else {
                System.out.println("Invalid Selection, please try again.");
            }
            clearScreenTimeDelay(delay);
            movementEngine();
        }

        if (getPlayerLocation().equals("BALL ROOM")) {
            System.out.println("Please select a direction to move, you are currently in the " + getPlayerLocation());
            System.out.println("Available Options: Right, Left.");
            String result = movingTutorialMovementInputCollection();

            if (result.equals("RIGHT")) {
                setPlayerLocation("MOVIE ROOM");
                System.out.println("You've entered the Movie Room!\n");
                finishMovementTutorial();
            } else if (result.equals("LEFT")) {
                setPlayerLocation("HALL");
                System.out.println("You've entered the Hall!");
                clearScreenTimeDelay(delay);
                movementEngine();
            } else {
                System.out.println("Invalid Selection, please try again.");
                movementEngine();
            }
        }
    }

    private void finishMovementTutorial() {
        if (getPlayerLocation().equals("MOVIE ROOM")) {
            System.out.println("You've beaten the movement tutorial, type exit to head back.");
        }
        movingTutorialMovementInputCollection();
    }

    private void clearScreenTimeDelay(int TIME_DELAY) throws InterruptedException {
        Thread.sleep(TIME_DELAY);
        clearScreen();
    }

    private void movingTutorialInformationPrompt() throws InterruptedException {
        String[] movingTutorialIntroStringArray = {
                "Welcome to the moving tutorial.",
                "Moving is a very important part of Apprenticeship.  Apprenticeship has a total of 12 rooms for you to" +
                        "navigate through.",
                "You can move a total of 4 different directions: Up, Down, Left, and Right.",
                "Each room you enter will have a specific direction(s) you can move.",
                "",
                "",
                "For this tutorial you will have three rooms in a single line for you to move between.",
                "You will be starting off in the Hall",
                "Type \"Start\" or any other command prompt to get started."
        };

        for (String movingTutorial : movingTutorialIntroStringArray) {
            Thread.sleep(700);
            System.out.println(movingTutorial);
        }
        userInput.next();
    }

    private void mapDisplay() {
            System.out.println(
                            "___________________________________________________________________________________________\n" +
                            "|                            |                                |                             |\n"+
                            "|          Hall              |          Ball Room             |          Movie Room         |\n"+
                            "|                            |                                |                             |\n"+
                            "|    Move Choices: Right     |   Move Choices: Left, Right    |     Move Choices: Left      |\n"+
                            "|                            |                                |                             |\n"+
                            "|                            |                                |                             |\n"+
                            "-----------------------------|--------------------------------|-----------------------------|\n"

            );
    }

    private String movingTutorialMovementInputCollection() {
        return userInput.next().toUpperCase().trim();
    }

    private void clearScreen(){
        for(int i = 0; i < 50; i++) {
            System.out.println("\b");
        }
    }

    public String getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(String playerLocation) {
        this.playerLocation = playerLocation;
    }
}
