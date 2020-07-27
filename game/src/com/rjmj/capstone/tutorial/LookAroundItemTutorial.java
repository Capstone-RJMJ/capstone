package com.rjmj.capstone.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LookAroundItemTutorial {
    private Scanner userInput = new Scanner(System.in);
    private String playerLocation = "HALL";
    private final int delay = 1000;
    private List<String> playerInventory = new ArrayList<>();
    private List<String> hallInventory = new ArrayList<>();
    private List<String> ballRoomInventory = new ArrayList<>();
    private List<String> movieRoomInventory = new ArrayList<>();

    public void startLookAroundTutorial() throws InterruptedException {
        hallInventory.add("MacBook Pro");
        ballRoomInventory.add("Ultrawide Monitor");
        movieRoomInventory.add("Cell Phone");
        clearScreenTimeDelay();
        lookAroundTakeItemIntroText();
        lookAroundEngine();
    }

    private void lookAroundTakeItemIntroText() throws InterruptedException {
        String[] lookAroundTakeItemText = {
                "Welcome to the look around and take item tutorial.",
                "Looking Around and taking items are a very important part of Apprenticeship.",
                "By issuing the command \"Look Around\" you will be provided a description of what is inside your current room.",
                "By issuing the command \"Take Item\" you will be able to take any available items inside your current room.",
                "",
                "",
                "For this tutorial you will have three rooms in a single line for you to move between, similar to the previous tutorial.",
                "You will be starting off in the Hall",
                "Type \"Next\" or any other command to get started."
        };

        for (String lookAroundTakeItem : lookAroundTakeItemText) {
            Thread.sleep(700);
            System.out.println(lookAroundTakeItem);
        }

        lookAroundTutorialInputCollection();
    }


    private void lookAroundEngine() throws InterruptedException {
        mapDisplay();
        if (getPlayerLocation().equals("HALL")) {
            System.out.println("Please select a direction to move, you are currently in the " + getPlayerLocation());
            System.out.println("Available Options: Right, Look Around, Take Item.");
            String result = lookAroundTutorialInputCollection();

            switch (result) {
                case "RIGHT":
                    setPlayerLocation("BALL ROOM");
                    System.out.println("You've entered the Ball Room!\n");
                    clearScreenTimeDelay();
                    lookAroundEngine();
                    break;
                case "LOOK AROUND":
                    if (hallInventory.contains("MacBook Pro")) {
                        System.out.println("You see a MacBook Pro on the ground.");
                    } else {
                        System.out.println("You see nothing.");
                    }
                    lookAroundEngine();
                    break;
                case "TAKE ITEM":
                    if (hallInventory.contains("MacBook Pro")) {
                        System.out.println("You take the MacBook Pro on the ground.");
                        playerInventory.add("MacBook Pro");
                        hallInventory.remove(0);
                        System.out.println("Your inventory is: " + playerInventory);
                    } else {
                        System.out.println("There is nothing to take.");
                    }
                    lookAroundEngine();
                    break;
                default:
                    System.out.println("Invalid Selection, please try again.");
                    lookAroundEngine();
                    break;
            }
        }

        if (getPlayerLocation().equals("BALL ROOM")) {
            System.out.println("Please select a direction to move, you are currently in the " + getPlayerLocation());
            System.out.println("Available Options: Right, Left, Look Around, Take Item.");
            String result = lookAroundTutorialInputCollection();

            switch (result) {
                case "RIGHT":
                    setPlayerLocation("MOVIE ROOM");
                    System.out.println("You've entered the Movie Room!\n");
                    finishMovementTutorial();
                    break;
                case "LEFT":
                    setPlayerLocation("HALL");
                    System.out.println("You've entered the Hall!");
                    lookAroundEngine();
                    break;
                case "LOOK AROUND":
                    if (ballRoomInventory.contains("Ultrawide Monitor")) {
                        System.out.println("You see an Ultrawide Monitor on the Ground.");
                    } else {
                        System.out.println("You see nothing.");
                    }
                    lookAroundEngine();
                    break;
                case "TAKE ITEM":
                    if (ballRoomInventory.contains("Ultrawide Monitor")) {
                        System.out.println("You take the Ultrawide Monitor on the ground.");
                        playerInventory.add(ballRoomInventory.get(0));
                        ballRoomInventory.remove(0);
                        System.out.println("Your inventory is: " + playerInventory);
                    } else {
                        System.out.println("There is nothing to take.");
                    }
                    lookAroundEngine();
                    break;
                default:
                    System.out.println("Invalid Selection, please try again.");
                    lookAroundEngine();
                    break;
            }
        }
    }

    private void finishMovementTutorial() {
        mapDisplay();
        System.out.println("Available Options: Look Around, Take Item.");
        String result = lookAroundTutorialInputCollection();

        if (result.equals("LOOK AROUND")) {
            if (movieRoomInventory.contains("Cell Phone")) {
                System.out.println("You see a Cell Phone on the ground.");
            } else {
                System.out.println("You see nothing.");
            }
            finishMovementTutorial();
        } else if (result.equals("TAKE ITEM")) {
            if (movieRoomInventory.contains("Cell Phone")) {
                playerInventory.add(movieRoomInventory.get(0));
                movieRoomInventory.remove(0);
                System.out.println("You take the cell phone on the ground.");
                System.out.println("Your inventory is: " + playerInventory);
            } else {
                System.out.println("There's nothing for you to take.");
                finishMovementTutorial();
            }
        } else {
            System.out.println("Invalid Selection, try again.");
            finishMovementTutorial();
        }

        if (playerInventory.contains("Cell Phone")) {
            System.out.println("You've beaten the look around and take item tutorial!  Press next to continue.");
            lookAroundTutorialInputCollection();
        }
    }

    private void clearScreenTimeDelay() throws InterruptedException {
        Thread.sleep(delay);
        clearScreen();
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

    private String lookAroundTutorialInputCollection() {
        return userInput.nextLine().toUpperCase();
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
