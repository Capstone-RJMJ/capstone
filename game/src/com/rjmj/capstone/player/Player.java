package com.rjmj.capstone.player;

import com.rjmj.capstone.room.Rooms;
import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerMoveDirection;
    private String playerActionSelection;
    // currentRoom set to Dining Room as it is the games starting location.
    private String currentRoom = "Dining Room";

    // enterName() will prompt the user to enter their desired name.
    public void collectPlayerName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.playerName = userInput.nextLine();
        System.out.println("Username has been set to: " + getPlayerName());
    }

    // moveSelection() will handle the room navigation choice for the player, logic completed in the appropriate method.
    public void moveSelection(Rooms room) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which direction would you like to move? (Up, Down, Left, Right)");
        this.playerMoveDirection = userInput.nextLine();
        System.out.println("Moving " + getPlayerMoveDirection());

        /*
            TODO:
             This switch case doesn't fully work currently.
             When exiting the dining room the player is forced right regardless of choice.
         */
        switch(getPlayerMoveDirection().toUpperCase()){
            case "UP":
                if ((room.getROOMS().get(getCurrentRoom()).get("up") != null)) {
                    moveUp(room);
                    break;
                }
            case "DOWN":
               if ((room.getROOMS().get(getCurrentRoom()).get("down") != null)) {
                   moveDown(room);
                   break;
               }
            case "LEFT":
                if ((room.getROOMS().get(getCurrentRoom()).get("left") != null)) {
                    moveLeft(room);
                    break;
                }
            case "RIGHT":
                if(room.getROOMS().get(getCurrentRoom()).get("right") != null) {
                  moveRight(room);
                  break;
               }
            default:
                // TODO: Create a custom exception for this down the line.
                System.out.println("Error, Please select Up, Down, Left, or Right");
                moveSelection(room);
        }
    }

    // availableActions() will prompt the player with a list of actions they can choose.
    public void availableActions(Rooms room) {
        System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which action would you like to do?");
        System.out.println("You are currently in the " + getCurrentRoom());
        this.playerActionSelection = userInput.nextLine();

        /*
            TODO:
                1. Look Around Logic
                2. Talk Logic
                3. Take Item Logic
         */
        switch(getPlayerActionSelection().toUpperCase()) {
            case "MOVE":
                moveSelection(room);
                break;
            case "LOOK AROUND":
                System.out.println("You look around, no one is there.\n");
                availableActions(room);
                break;
            case "TALK":
                System.out.println("No one is around, you say hello to yourself.\n");
                availableActions(room);
                break;
            case "TAKE ITEM":
                System.out.println("You take the item\n");
                availableActions(room);
                break;
            default:
                // TODO: Create a custom exception for this down the line.
                System.out.println("Error, please select a valid item.\n");
                availableActions(room);
        }
    }

    public void moveUp(Rooms room) {
        setCurrentRoom(room.getROOMS().get(getCurrentRoom()).get("up"));
        System.out.println("Moved Up to " + getCurrentRoom());
        availableActions(room);
    }

    public void moveDown(Rooms room) {
        setCurrentRoom(room.getROOMS().get(getCurrentRoom()).get("down"));
        System.out.println("Moved Down to " + getCurrentRoom());
        availableActions(room);
    }

    public void moveLeft(Rooms room) {
        setCurrentRoom(room.getROOMS().get(getCurrentRoom()).get("left"));
        System.out.println("Moved Left to " + getCurrentRoom());
        availableActions(room);
    }

    public void moveRight(Rooms room) {
        setCurrentRoom(room.getROOMS().get(getCurrentRoom()).get("right"));
        System.out.println("Moved Right to " + getCurrentRoom());
        availableActions(room);
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerMoveDirection() {
        return playerMoveDirection;
    }

    public String getPlayerActionSelection() {
        return playerActionSelection;
    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }
}