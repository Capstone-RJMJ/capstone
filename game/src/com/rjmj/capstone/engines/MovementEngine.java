package com.rjmj.capstone.engines;

import com.rjmj.capstone.player.Inventory;
import com.rjmj.capstone.room.RoomEnum;
import com.rjmj.capstone.room.Rooms;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MovementEngine {
    private String currentRoom = "DINING ROOM";
    public Rooms room = new Rooms();
//    public String move(String input) { return moveChoices(input); }

//    public String moveChoices(String input) {
//        String result;
//        switch(input) {
//            case "DINING ROOM":
//                result = diningRoomChoices(input);
//                break;
//            case "HALL":
//                result = hallRoomChoices(input);
//                break;
//            case "BALL ROOM":ballRoomChoices(input);
////                break;
//                result =
//            case "MOVIE ROOM":
//                result = movieRoomChoices(input);
//                break;
//            case "STAIRS":
//                result = stairsRoomChoices(input);
//                break;
//            case "DOWN STAIRS HALL":
//                result = downStairsHallRoomChoices(input);
//                break;
//            case "BEDROOM":
//                result = bedroomRoomChoices(input);
//                break;
//            case "KITCHEN":
//                result = kitchenRoomChoices(input);
//                break;
//            case "BATHROOM":
//                result = bathroomRoomChoices(input);
//                break;
//            case "LIBRARY":
//                result = libraryRoomChoices(input);
//                break;
//            case "CAVE":
//                result = caveRoomChoices(input);
//                break;
//            case "LAB":
//                result = labRoomChoices(input);
//                break;
//            default:
//                result = moveChoices(input);
//                break;
//        }
//
//        return result;
//    }

    private String questionBuilder(String currentRoom){
        StringBuilder sb = new StringBuilder("Which direction would you like to go? (");
        String left,right,down,up;
        Map<String,String> rm = room.getROOMS().get(currentRoom);
        Set<String> roomKeys = rm.keySet();
        // Loop through keys to build custom question for player giving direction options
        for(String moveOption : roomKeys){
            if(moveOption.equals("left")){
                left = rm.get(moveOption);
                sb.append(" LEFT: " + left + ",");
            }
            else if(moveOption.equals("right")){
                right = rm.get(moveOption);
                sb.append(" RIGHT: " + right + ",");
            }
            else if(moveOption.equals("down")){
                down = rm.get(moveOption);
                sb.append(" DOWN: " + down + ",");
            }
            else if(moveOption.equals("up")){
                up = rm.get(moveOption);
                sb.append(" UP: " + up + ",");
            }
        }
//        TODO: Trailing Comma doesn't come off!!! Tried the two following ways :(
        sb.toString().replaceAll(",$", "");
        sb.toString().substring(0, sb.toString().length() - 1);

        sb.append(" )");
        return sb.toString();

    }

    public String roomChoices(String currentRoom, Inventory inventory) throws IOException {
        String result = getCurrentRoom();
        String question = questionBuilder(currentRoom);
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String userChoice = scanner.nextLine().toLowerCase();
        Map<String,String> rm = room.getROOMS().get(currentRoom);
        if(rm.get("room").equals("Bedroom") && userChoice.equals("left")){
            setCurrentRoom(rm.get(userChoice).toUpperCase());
            inventory.talkToCharacter(room,"LIBRARY",inventory);// force talking to Peter when going into Library
        }
        if(rm.containsKey(userChoice)) {
            setCurrentRoom(rm.get(userChoice).toUpperCase());
            result = rm.get(userChoice).toUpperCase();
            }
        else {
            System.out.println("Invalid Selection, try again.");
            roomChoices(getCurrentRoom(),inventory);
        }

        return result;
    }

//    private String diningRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("RIGHT")) {
//            result = "HALL";
//
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String hallRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left, Down)");
//        String userChoice = scanner.nextLine();
//
//        switch (userChoice.toUpperCase()) {
//            case "RIGHT":
//                result = "BALL ROOM";
//                break;
//            case "LEFT":
//                result = "DINING ROOM";
//                break;
//            case "DOWN":
//                result = "KITCHEN";
//                break;
//            default:
//                System.out.println("Invalid Selection, try again.");
//                result = moveChoices(input);
//                break;
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String ballRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("RIGHT")) {
//            result = "MOVIE ROOM";
//        } else if (userChoice.toUpperCase().equals("LEFT")) {
//            result = "HALL";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String movieRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("RIGHT")) {
//            result = "STAIRS";
//        } else if (userChoice.toUpperCase().equals("LEFT")) {
//            result = "BALL ROOM";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String stairsRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Up, Down)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("UP")) {
//            result = "MOVIE ROOM";
//        } else if (userChoice.toUpperCase().equals("DOWN")) {
//            result = "DOWN STAIRS HALL";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String downStairsHallRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("RIGHT")) {
//            result = "STAIRS";
//        } else if (userChoice.toUpperCase().equals("LEFT")) {
//            result = "BEDROOM";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String bedroomRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left, Down)");
//        String userChoice = scanner.nextLine();
//
//        switch (userChoice.toUpperCase()) {
//            case "RIGHT":
//                result = "DOWN STAIRS HALL";
//                break;
//            case "LEFT":
//                result = "KITCHEN";
//                break;
//            case "DOWN":
//                result = "LIBRARY";
//                break;
//            default:
//                System.out.println("Invalid Selection, try again.");
//                result = moveChoices(input);
//                break;
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String kitchenRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left, Up)");
//        String userChoice = scanner.nextLine();
//
//        switch (userChoice.toUpperCase()) {
//            case "RIGHT":
//                result = "BEDROOM";
//                break;
//            case "LEFT":
//                result = "BATHROOM";
//                break;
//            case "UP":
//                result = "HALL";
//                break;
//            default:
//                System.out.println("Invalid Selection, try again.");
//                result = moveChoices(input);
//                break;
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String bathroomRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("RIGHT")) {
//            result = "KITCHEN";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String libraryRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right, Left, Up)");
//        String userChoice = scanner.nextLine();
//
//        switch (userChoice.toUpperCase()) {
//            case "RIGHT":
//                result = "CAVE";
//                break;
//            case "LEFT":
//                result = "LAB";
//                break;
//            case "UP":
//                result = "BEDROOM";
//                break;
//            default:
//                System.out.println("Invalid Selection, try again.");
//                result = moveChoices(input);
//                break;
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//    private String labRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Left)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("LEFT")) {
//            result = "LIBRARY";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }
//
//
//    private String caveRoomChoices(String input) {
//        String result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which direction would you like to go? (Right)");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.toUpperCase().equals("RIGHT")) {
//            result = "LIBRARY";
//        } else {
//            System.out.println("Invalid Selection, try again.");
//            result = moveChoices(input);
//        }
//        setCurrentRoom(result);
//        return result;
//    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }
}