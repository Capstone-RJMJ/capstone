package com.rjmj.capstone.player;

import com.rjmj.capstone.room.Room;
import com.rjmj.capstone.room.Rooms;
import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerMoveDirection;
    private String playerActionSelection;
    // currentRoom set to Dining Room as it is the games starting location.
    private String currentRoom = "Dining Room";
    private Room theEnumCurrentRoom = Room.DINING_ROOM;

    // enterName() will prompt the user to  enter their desired name.
    public void collectPlayerName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.playerName = userInput.nextLine();
        System.out.println("Username has been set to: " + getPlayerName());
    }

    // moveSelection() will handle the room navigation choice for the player, logic completed in the appropriate method.
    public void moveSelection() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which direction would you like to move? (Up, Down, Left, Right)");
        this.playerMoveDirection = userInput.nextLine();

        switch(getPlayerMoveDirection().toUpperCase()) {
            case "UP":
                System.out.println("Moving " + getPlayerMoveDirection());
                moveUp(getTheEnumCurrentRoom());
            case "DOWN":
                System.out.println("Moving " + getPlayerMoveDirection());
                moveDown(getTheEnumCurrentRoom());
            case "LEFT":
                System.out.println("Moving " + getPlayerMoveDirection());
                moveLeft(getTheEnumCurrentRoom());
            case "RIGHT":
                System.out.println("Moving " + getPlayerMoveDirection());
                moveRight(getTheEnumCurrentRoom());
            default:
                // TODO: Create a custom exception for this down the line.
                System.out.println("Error, Please select Up, Down, Left, or Right");
                moveSelection();
        }
    }

    public void moveRight(Room input) {
        if (!getTheEnumCurrentRoom().canMoveRight(input)) {
            setTheEnumCurrentRoom(getTheEnumCurrentRoom().possibleRightMovement.get(0));
            System.out.println(getTheEnumCurrentRoom());
        } else {
            moveSelection();
        }
    }

    public void moveLeft(Room input) {
        if (!getTheEnumCurrentRoom().canMoveLeft(input)) {
            setTheEnumCurrentRoom(getTheEnumCurrentRoom().possibleLeftMovement.get(0));
            System.out.println(getTheEnumCurrentRoom());
        } else {
            moveSelection();
        }
    }

    public void moveDown(Room input) {
        if (!getTheEnumCurrentRoom().canMoveDown(input)) {
            setTheEnumCurrentRoom(getTheEnumCurrentRoom().possibleDownMovement.get(0));
            System.out.println(getTheEnumCurrentRoom());
        } else {
            moveSelection();
        }
    }

    public void moveUp(Room input) {
        if (!getTheEnumCurrentRoom().canMoveUp(input)) {
            setTheEnumCurrentRoom(getTheEnumCurrentRoom().possibleUpMovement.get(0));
            System.out.println(getTheEnumCurrentRoom());
        } else {
            System.out.println("NOPE");
            moveSelection();
        }
    }


    // availableActions() will prompt the player with a list of actions they can choose.
    public void availableActions() {
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
                moveSelection();
                break;
            case "LOOK AROUND":
                System.out.println("You look around, no one is there.\n");
                break;
            case "TALK":
                System.out.println("No one is around, you say hello to yourself.\n");
                break;
            case "TAKE ITEM":
                System.out.println("You take the item\n");
                break;
            default:
                // TODO: Create a custom exception for this down the line.
                System.out.println("Error, please select a valid item.\n");
        }
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

    public Room getTheEnumCurrentRoom() {
        return theEnumCurrentRoom;
    }

    public void setTheEnumCurrentRoom(Room theEnumCurrentRoom) {
        this.theEnumCurrentRoom = theEnumCurrentRoom;
    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }
}