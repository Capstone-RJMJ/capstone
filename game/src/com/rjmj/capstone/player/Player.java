package com.rjmj.capstone.player;

import com.rjmj.capstone.engines.MovementEngine;
import com.rjmj.capstone.room.Rooms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerActionSelection;
    private Inventory inventory = new Inventory();
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
    public void availableActions() throws IOException {
        Rooms room = new Rooms();
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are currently in the " + movementEngine.getCurrentRoom());
        System.out.println("Which action would you like to do?");
        ArrayList pi = getInventory().getPlyrInv();
        if(pi.contains("Red Liquid") && pi.contains("Blue Liquid") && pi.contains("Green Liquid") && pi.contains("beaker")){
            System.out.println("You now have all the items necessary to Mix the vaccine ingredients...but in what order??");
            System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move, Mix (ingredients).");
        }
        else {
            System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move.");
        }
        this.playerActionSelection = userInput.nextLine();

        switch(getPlayerActionSelection().toUpperCase()) {
            case "MOVE":
                movementEngine.roomChoices(movementEngine.getCurrentRoom(),getInventory());
                availableActions();
                break;
            case "LOOK AROUND":
                room.lookAround(movementEngine.getCurrentRoom(), getInventory());
                availableActions();
                break;
            case "TALK":
                getInventory().talkToCharacter(room,movementEngine.getCurrentRoom(),getInventory());
                availableActions();
                break;
            case "TAKE ITEM":
                room.getItem(getInventory(), movementEngine.getCurrentRoom());
                availableActions();
                break;
            case "MIX":
                System.out.println("need to write the function for mixing and checking");
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

    public Inventory getInventory() {
        return inventory;
    }
}