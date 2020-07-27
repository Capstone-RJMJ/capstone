package com.rjmj.capstone.player;

import com.rjmj.capstone.engines.MovementEngine;
import com.rjmj.capstone.room.Rooms;
import com.rjmj.capstone.room.GameTextArt;
import com.rjmj.capstone.timer.Countdown;
import com.rjmj.capstone.tutorial.Tutorial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerActionSelection;
    private String playInput;
    private Inventory inventory = new Inventory();
    private MovementEngine movementEngine = new MovementEngine();
    private Tutorial tutorial = new Tutorial();
    private Countdown cd = new Countdown();
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private GameTextArt gameTextArt = new GameTextArt();
    private ArrayList pi = getInventory().getPlyrInv();






    //[Syringe, Blue Liquid, Plunger, Key, Red Liquid, Box, Beaker, Green Liquid, Recipe, Needle]
    private void currentLocationDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append(ANSI_CYAN + "___________________________________________________________________________________________________________________________________________________________________________                                    \n" +
                "|                                                                                                                                                                          |\n" +
                "|                You are currently in the:  "+ANSI_RESET + ANSI_RED + movementEngine.getCurrentRoom() + ANSI_RESET + ANSI_CYAN +"                                            \n" +
                "|                                                                                                                                                                          |\n" +
                "|   Move to a new location      [Command:"+ANSI_RESET + ANSI_YELLOW +" Move"+ ANSI_RESET + ANSI_CYAN +"]                                                                                                                            |\n" +
                "|   Look Around the Room        [Command:"+ANSI_RESET + ANSI_GREEN +" Look Around"+ ANSI_RESET + ANSI_CYAN +"]                        Current Inventory                                                                            |\n" +
                "|   Talk to someone             [Command:"+ANSI_RESET + ANSI_PURPLE +" Talk"+ ANSI_RESET + ANSI_CYAN +"]                             "+ inventory.getPlyrInv() +"                                                                   \n" +
                "|   Take any available item     [Command:"+ANSI_RESET + ANSI_BLUE +" Take Item"+ ANSI_RESET + ANSI_CYAN +"]                                                                                                                       |\n"+
                "|   Display the game map        [Command:"+ANSI_RESET + ANSI_WHITE +" Map"+ ANSI_RESET + ANSI_CYAN +"]                                                                                                                             |\n" +
                "|   Exit this Program           [Command:"+ANSI_RESET + ANSI_RED +" Exit"+ ANSI_RESET + ANSI_CYAN +"]                                                                                                                            |\n");

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


    public String play() {
        Scanner userInput = new Scanner(System.in);
        gameTextArt.introArt();
        gameTextArt.introTextDelayed();
        setPlayInput(userInput.next().toUpperCase().trim());
        return getPlayInput();
    }


    public void playGame(String input) throws IOException, InterruptedException {
        switch (input) {
            case "START":
                collectPlayerName();
                backToMenu();
                break;
            case "INTRO":
                gameTextArt.introText();
                collectPlayerName();
                backToMenu();
                break;
            case "TUTORIAL":
                tutorial.startTutorial();
                playGame(play());
                break;
            case "EXIT":
                System.exit(0);
                break;
            default:
                System.out.println("Error, please try another entry.");
                play();
                break;
        }
    }

    // enterName() will prompt the user to  enter their desired name.
    public void collectPlayerName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(ANSI_PURPLE + "\nPlease enter your name: " + ANSI_RESET);
        this.playerName = userInput.nextLine();
        movementEngine.clearScreen();
        System.out.println(ANSI_PURPLE + "Username has been set to: " + ANSI_RESET + ANSI_RED + getPlayerName() + ANSI_RESET);
        cd.startTimer();
        cd.resetTimerNewGame();
    }

    public String collectPlayerActionInput() {
        Scanner userInput = new Scanner(System.in);
        currentLocationDisplay();

        if (pi.contains(ANSI_RED + "Red Liquid" + ANSI_CYAN) && pi.contains(ANSI_BLUE + "Blue Liquid" + ANSI_CYAN) && pi.contains(ANSI_GREEN + "Green Liquid" + ANSI_CYAN) && pi.contains("Beaker")){
            System.out.println("You can do the following actions:" +ANSI_RESET + ANSI_GREEN + "Look Around, " +ANSI_RESET + ANSI_PURPLE + "Talk, " +ANSI_RESET + ANSI_BLUE + "Take Item, " +ANSI_RESET + ANSI_YELLOW + "Move, " +ANSI_RESET + ANSI_WHITE + "Map, " +ANSI_RESET + ANSI_PURPLE + " Mix, " +ANSI_RESET + ANSI_RED + "Exit" + ANSI_RESET);
        } else {
            System.out.println(ANSI_CYAN + "You can do the following actions:" +ANSI_RESET + ANSI_GREEN + "Look Around, " +ANSI_RESET + ANSI_PURPLE + "Talk, " +ANSI_RESET + ANSI_BLUE + "Take Item, " +ANSI_RESET + ANSI_YELLOW + "Move, " +ANSI_RESET + ANSI_WHITE + "Map, " +ANSI_RESET + ANSI_RED + "Exit" +ANSI_RESET);
        }

        setPlayerActionSelection(userInput.nextLine().toUpperCase());
        return getPlayerActionSelection();
    }



    // availableActions() will prompt the player with a list of actions they can choose, based on current room.
    private void availableActions(String input) throws IOException, InterruptedException {
        Rooms room = new Rooms();

        switch(input) {
            case "MOVE":
                movementEngine.changeRoom(getInventory(), movementEngine.roomChoices(),cd);
                backToMenu();
                break;
            case "LOOK AROUND":
                room.lookAround(movementEngine.getCurrentRoom(), getInventory());
                backToMenu();
                break;
            case "TALK":
                getInventory().talkToCharacter(room, movementEngine.getCurrentRoom(), getInventory(),cd);
                backToMenu();
                break;
            case "TAKE ITEM":
                room.getItem(getInventory(), movementEngine.getCurrentRoom(), cd);
                backToMenu();
                break;
            case "MIX":
                winCheck();
                break;
            case "MAP":
                movementEngine.clearScreen();
                gameTextArt.mapDisplay();
                backToMenu();
                break;
            case "EXIT":
                play();
                break;
            default:
                System.out.println("Error, please select a valid item.\n");
                backToMenu();
        }
    }

    private void winCheck() throws IOException, InterruptedException {
        if(pi.contains(ANSI_RED +"Red Liquid" + ANSI_CYAN) && pi.contains(ANSI_BLUE + "Blue Liquid" + ANSI_CYAN) && pi.contains(ANSI_GREEN + "Green Liquid" + ANSI_CYAN) && pi.contains("Beaker")
                && pi.contains("Recipe")){
            gameTextArt.winningArtDisplay();
        } else {
            System.out.println("You do not have all of the required items, keep looking around.");
            backToMenu();
        }
    }

    private void backToMenu() throws IOException, InterruptedException {
        availableActions(collectPlayerActionInput());
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

    public String getPlayInput() {
        return playInput;
    }

    public void setPlayInput(String playInput) {
        this.playInput = playInput;
    }

    public void setPlayerActionSelection(String playerActionSelection) {
        this.playerActionSelection = playerActionSelection;
    }
}
