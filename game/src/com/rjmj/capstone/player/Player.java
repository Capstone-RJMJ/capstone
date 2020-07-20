package com.rjmj.capstone.player;

import com.rjmj.capstone.engines.MovementEngine;
import com.rjmj.capstone.room.Rooms;

import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerActionSelection;

    MovementEngine movementEngine = new MovementEngine();

    public Player() {
        // No Argument Constructor
    }

    // This will mainly be for testing
    protected Player(String name) {
        this.playerName = name;
    }

    // This will mainly be for testing
    protected Player(String name, String playerActionSelection) {
        this.playerName = name;
        this.playerActionSelection = playerActionSelection;
    }

    // enterName() will prompt the user to  enter their desired name.
    public void collectPlayerName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.playerName = userInput.nextLine();
        System.out.println("Username has been set to: " + getPlayerName());
    }

    // availableActions() will prompt the player with a list of actions they can choose, based on current room.
    public void availableActions() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are currently in the " + movementEngine.getCurrentRoom());
        System.out.println("Which action would you like to do?");
        System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move.");
        this.playerActionSelection = userInput.nextLine();

        /*
            TODO:
                1. Look Around Logic
                2. Talk Logic
                3. Take Item Logic
         */
        switch(getPlayerActionSelection().toUpperCase()) {
            case "MOVE":
                movementEngine.roomChoices(movementEngine.getCurrentRoom());
                availableActions();
                break;
            case "LOOK AROUND":
                Rooms room = new Rooms();
                room.lookAround(room,movementEngine.getCurrentRoom());
                availableActions();
                break;
            case "TALK":
                System.out.println("No one is around, you say hello to yourself.\n");
                availableActions();
                break;
            case "TAKE ITEM":
                System.out.println("You take the item\n");
                availableActions();
                break;
            default:
                // TODO: Create a custom exception for this down the line.
                System.out.println("Error, please select a valid item.\n");
                availableActions();
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerActionSelection() {
        return playerActionSelection;
    }
}