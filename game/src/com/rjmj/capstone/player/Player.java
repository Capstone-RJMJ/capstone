package com.rjmj.capstone.player;

import com.rjmj.capstone.engines.MovementEngine;
import com.rjmj.capstone.room.Rooms;
import com.rjmj.capstone.room.GameTextArt;
import com.rjmj.capstone.timer.Countdown;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerActionSelection;
    private Inventory inventory = new Inventory();
    private MovementEngine movementEngine = new MovementEngine();
    private Countdown cd = new Countdown();
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";


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

    public void playGame() throws IOException, InterruptedException {
        GameTextArt gameTextARt = new GameTextArt();
        Scanner userInput = new Scanner(System.in);
        gameTextARt.introArt();
        gameTextARt.introTextDelayed();

        switch (userInput.next().toUpperCase().trim()) {
            case "START":
                collectPlayerName();
                availableActions();
                break;
            case "INTRO":
                gameTextARt.introText();
                collectPlayerName();
                availableActions();
                break;
            case "MAP":
                gameTextARt.mapDisplay();
                break;
            case "EXIT":
                System.exit(0);
                break;
            default:
                System.out.println("Error, please try another entry.");
                playGame();
                break;
        }
    }

    // enterName() will prompt the user to  enter their desired name.
    public void collectPlayerName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(ANSI_PURPLE + "\nPlease enter your name: " + ANSI_RESET);
        this.playerName = userInput.nextLine();
        System.out.println(ANSI_PURPLE + "Username has been set to: " + ANSI_RESET + ANSI_RED + getPlayerName() + ANSI_RESET);
        cd.startTimer();
        cd.resetTimerNewGame();
    }

    // availableActions() will prompt the player with a list of actions they can choose, based on current room.
    public void availableActions() throws IOException, InterruptedException {
//        cd.displayTimeLeft();
        Rooms room = new Rooms();
        Scanner userInput = new Scanner(System.in);
        currentLocationDisplay();
        ArrayList pi = getInventory().getPlyrInv();
        if(pi.contains(ANSI_RED +"Red Liquid" + ANSI_CYAN) && pi.contains(ANSI_BLUE + "Blue Liquid" + ANSI_CYAN) && pi.contains(ANSI_GREEN + "Green Liquid" + ANSI_CYAN) && pi.contains("Beaker")){
            System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move, Mix.");
        } else {
            System.out.println(ANSI_YELLOW + "You can do the following actions: Look Around, Talk, Take Item, Move." + ANSI_RESET);
        }

        this.playerActionSelection = userInput.nextLine().trim();

        switch(getPlayerActionSelection().toUpperCase()) {
            case "MOVE":
                movementEngine.changeRoom(getInventory(), movementEngine.roomChoices());
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
                if(pi.contains(ANSI_RED +"Red Liquid" + ANSI_CYAN) && pi.contains(ANSI_BLUE + "Blue Liquid" + ANSI_CYAN) && pi.contains(ANSI_GREEN + "Green Liquid" + ANSI_CYAN) && pi.contains("Beaker")
                        && pi.contains("Recipe")){
                    GameTextArt gameTextARt = new GameTextArt();
                    gameTextARt.winningArtDisplay();
                } else {
                    System.out.println("You do not have all of the required items, keep looking around.");
                    availableActions();
                }
                break;
            case "MAP":
                movementEngine.getCurrentRoom();
                GameTextArt gameTextArt = new GameTextArt();
                gameTextArt.mapDisplay();
                break;
            case "EXIT":
                playGame();
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
//[Syringe, Blue Liquid, Plunger, Key, Red Liquid, Box, Beaker, Green Liquid, Recipe, Needle]
    public void currentLocationDisplay() {
        ArrayList pi = getInventory().getPlyrInv();

        StringBuilder sb = new StringBuilder();
        sb.append(ANSI_CYAN + "___________________________________________________________________________________________________________________________________________________________________________                                    \n" +
                "|                                                                                                                                                                          |\n" +
                "|                You are currently in the:                                                                                                                                 |\n" +
                "|                      "+ movementEngine.getCurrentRoom() +"                                                                                                               \n" +
                "|   Move to a new location      [Command: Move]                                                                                                                            |\n" +
                "|   Look Around the Room        [Command: Look Around]                        Current Inventory                                                                            |\n" +
                "|   Talk to someone             [Command: Talk]                             "+ inventory.getPlyrInv() +"                                                                   \n" +
                "|   Take any available item     [Command: Take Item]                                                                                                                       |\n" +
                "|   Exit this Program           [Command: Exit]                                                                                                                            |\n");

        if(pi.contains(ANSI_RED +"Red Liquid" + ANSI_CYAN) && pi.contains(ANSI_BLUE + "Blue Liquid" + ANSI_CYAN) && pi.contains(ANSI_GREEN + "Green Liquid" + ANSI_CYAN) && pi.contains("Beaker")) {
            System.out.println(ANSI_PURPLE + "You now have all the items necessary to Mix the vaccine ingredients...you will need to find the recipe now." + ANSI_RESET);
            sb.append("|   Mix the vaccine ingredients [Command: MIX]                                                                                                                             |\n");
        }
        sb.append("|                                                                                                                                                                          |\n" +
                "|                                                                                                                                                                          |\n" +
                "|              "+ cd.displayTimeInsideArt() +"                                                                                                                                       |\n" +
                "|__________________________________________________________________________________________________________________________________________________________________________|\n" + ANSI_RESET);
        System.out.println(sb.toString());
    }
}
