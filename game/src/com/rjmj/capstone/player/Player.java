package com.rjmj.capstone.player;

import com.rjmj.capstone.room.Rooms;

import java.util.Scanner;

public class Player {
    private String name;
    private String moveDirection;
    private String playerSelection;
    private String currentRoom = "Dining Room";


    public void enterName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        this.name = userInput.nextLine();
        System.out.println("Username has been set to: " + getName());
    }

    public void moveSelection(Rooms room) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which direction would you like to move? (Up, Back, Left, Right");
        this.moveDirection = userInput.nextLine();
        System.out.println("Moving " + getMoveDirection());

        switch(getMoveDirection().toUpperCase()){
            case "UP":
                moveUp(room);
                break;
            case "BACK":
                moveDown(room);
                break;
            case "LEFT":
                moveLeft(room);
                break;
            case "RIGHT":
            if(room.getROOMS().get(getCurrentRoom()).get("right") != null) {
                moveRight(room);
                break;
            }
            default:
                System.out.println("Error, Please select Up, Down, Left, or Right");
                moveSelection(room);
        }
    }

    public void availableActions(Rooms room) {
        System.out.println("You can do the following actions: Look Around, Talk, Take Item, Move.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which action would you like to do?");
        this.playerSelection = userInput.nextLine();

        switch(getPlayerSelection().toUpperCase()) {
            case "MOVE":
                moveSelection(room);
                break;
            case "LOOK AROUND":
                System.out.println("You look around, no one is there.");
                availableActions(room);
                break;
            case "TALK":
                System.out.println("No one is around, you say hello to yourself.");
                availableActions(room);
                break;
            case "TAKE ITEM":
                System.out.println("You take the item");
                availableActions(room);
                break;
            default:
                System.out.println("Error, please select a valid item.");
                availableActions(room);
        }
    }

    public void moveUp(Rooms room) {
        System.out.println("Moved Up");
        availableActions(room);
    }

    public void moveDown(Rooms room) {
        System.out.println("Moved Down");
        availableActions(room);
    }

    public void moveLeft(Rooms room) {
        System.out.println("Moved Left");
        availableActions(room);
    }

    public void moveRight(Rooms room) {
        setCurrentRoom(room.getROOMS().get(getCurrentRoom()).get("right"));
        System.out.println("Moved Right");
        System.out.println(getCurrentRoom());
        availableActions(room);
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
    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }
}