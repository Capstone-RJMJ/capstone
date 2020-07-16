package com.rjmj.capstone.player;

import java.util.Scanner;

public class Player {
    private String name;
    private String moveDirection;
    private String playerSelection;

    public void enterName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.name = userInput.nextLine();
        System.out.println("Username has been set to: " + getName());
    }

    public void moveSelection() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which direction would you like to move? (Up, Back, Left, Right");
        this.moveDirection = userInput.nextLine();
        System.out.println("Moving " + getMoveDirection());

        switch(getMoveDirection().toUpperCase()){
            case "UP":
                moveUp();
                break;
            case "BACK":
                moveDown();
                break;
            case "LEFT":
                moveLeft();
                break;
            case "RIGHT":
                moveRight();
                break;
            default:
                System.out.println("Error, Please select Up, Down, Left, or Right");
                moveSelection();
        }
    }

    public void availableActions() {
        System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which action would you like to do?");
        this.playerSelection = userInput.nextLine();

        switch(getPlayerSelection().toUpperCase()) {
            case "MOVE":
                moveSelection();
                break;
            case "LOOK AROUND":
                System.out.println("You look around, no one is there.");
                availableActions();
                break;
            case "TALK":
                System.out.println("No one is around, you say hello to yourself.");
                availableActions();
                break;
            case "TAKE ITEM":
                System.out.println("You take the item");
                availableActions();
                break;
            default:
                System.out.println("Error, please select a valid item.");
                availableActions();
        }
    }

    public void moveUp() {
        System.out.println("Moved Up");
        availableActions();
    }

    public void moveDown() {
        System.out.println("Moved Down");
        availableActions();
    }

    public void moveLeft() {
        System.out.println("Moved Left");
        availableActions();
    }

    public void moveRight() {
        System.out.println("Moved Right");
        availableActions();
    }

    public String getName () {
        return name;
    }

    public String getMoveDirection() {
        return moveDirection;
    }

    public String getPlayerSelection() {
        return playerSelection;
    }
}