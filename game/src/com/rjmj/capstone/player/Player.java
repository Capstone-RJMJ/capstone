package com.rjmj.capstone.player;

import com.rjmj.capstone.engines.MovementEngine;
import com.rjmj.capstone.room.Rooms;
import com.rjmj.capstone.room.GameTextArt;
import com.rjmj.capstone.timer.Countdown;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerActionSelection;
    private Inventory inventory = new Inventory();
    MovementEngine movementEngine = new MovementEngine();
    Countdown cd = new Countdown();

    // This empty constructor to be here for the client class to run the program.
    public Player() {
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

    public void playGame() throws IOException {
        GameTextArt gameTextARt = new GameTextArt();
        Scanner userInput = new Scanner(System.in);
        gameTextARt.introArt();
        gameTextARt.authorInformationDisplay();

        switch (userInput.next().toUpperCase()) {
            case "START":
                collectPlayerName();
                availableActions();
                break;
            case "INTRO":
                gameTextARt.introText();
                collectPlayerName();
                availableActions();
                break;
            case "EXIT":
                System.exit(1);
            default:
                System.out.println("Error, please try another entry.");
                playGame();
                break;
        }
    }

    // enterName() will prompt the user to  enter their desired name.
    public void collectPlayerName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.playerName = userInput.nextLine();
        System.out.println("Username has been set to: " + getPlayerName());
        cd.startTimer();
    }

    // availableActions() will prompt the player with a list of actions they can choose, based on current room.
    public void availableActions() throws IOException {
        cd.displayTimeLeft();
        Rooms room = new Rooms();
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are currently in the " + movementEngine.getCurrentRoom());
        System.out.println("Which action would you like to do?");
        ArrayList pi = getInventory().getPlyrInv();
        if(pi.contains("Red Liquid") && pi.contains("Blue Liquid") && pi.contains("Green Liquid") && pi.contains("Beaker")){
            System.out.println("You now have all the items necessary to Mix the vaccine ingredients...you will need to find the recipe now.");
            System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move, Mix.");
        } else {
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
                room.getItem(getInventory(), movementEngine.getCurrentRoom(),cd);
                availableActions();
                break;
            case "MIX":
                if(pi.contains("Red Liquid") && pi.contains("Blue Liquid") && pi.contains("Green Liquid") && pi.contains("Beaker")
                        && pi.contains("Recipe")){
                    GameTextArt gameTextARt = new GameTextArt();
                    gameTextARt.winningArtDisplay();
                } else {
                    System.out.println("You do not have all of the required items, keep looking around.");
                    availableActions();
                }
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