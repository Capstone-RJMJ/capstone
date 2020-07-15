package com.rjmj.capstone.player;

import java.util.Scanner;

public class Player {
    private String name;
    private String moveDirection;


    public void enterName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.name = userInput.nextLine();
        System.out.println("Username has been set to: " + getName());
    }

    public void moveSelection() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which direction would you like to move? (Up, Down, Left, Right");
        this.moveDirection = userInput.nextLine();
        System.out.println("Moving " + getMoveDirection());

        switch(getMoveDirection().toUpperCase()){
            case "UP":
                moveUp();
                break;
            case "DOWN":
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
        // TODO: Update logic based on which room the player is in.
    }

    // TODO: Update the moveUp, Down, Left, Right Logic with the correct room once the classes are finished.
    public void moveUp() {
        System.out.println("Moved Up");
    }

    public void moveDown() {
        System.out.println("Moved Down");
    }

    public void moveLeft() {
        System.out.println("Moved Left");
    }

    public void moveRight() {
        System.out.println("Moved Right");
    }

    public String getName () {
        return name;
    }

    public String getMoveDirection() {
        return moveDirection;
    }
}