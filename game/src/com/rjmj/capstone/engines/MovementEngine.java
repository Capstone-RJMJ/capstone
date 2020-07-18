package com.rjmj.capstone.engines;

import java.util.Scanner;

public class MovementEngine {
    public String move(String input) {
        return moveChoices(input);
    }

    private String moveChoices(String input) {
        String result;
        switch(input) {
            case "DINING ROOM":
                result = diningRoomChoices(input);
                break;
            case "HALL":
                result = hallRoomChoices(input);
                break;
            case "BALL ROOM":
                result = ballRoomChoices(input);
                break;
            case "MOVIE ROOM":
                result = movieRoomChoices(input);
                break;
            case "STAIRS":
                result = stairsRoomChoices(input);
                break;
            case "DOWN STAIRS HALL":
                result = downStairsHallRoomChoices(input);
                break;
            case "BEDROOM":
                result = bedroomRoomChoices(input);
                break;
            case "KITCHEN":
                result = kitchenRoomChoices(input);
                break;
            case "BATHROOM":
                result = bathroomRoomChoices(input);
                break;
            case "LIBRARY":
                result = libraryRoomChoices(input);
                break;
            case "CAVE":
                result = caveRoomChoices(input);
                break;
            case "LAB":
                result = labRoomChoices(input);
                break;
            default:
                result = move(input);
                break;
        }

        return result;
    }

    private String diningRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("RIGHT")) {
            result = "HALL";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }

    private String hallRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left, Down)");
        String userChoice = scanner.nextLine();

        switch (userChoice.toUpperCase()) {
            case "RIGHT":
                result = "BALL ROOM";
                break;
            case "LEFT":
                result = "DINING ROOM";
                break;
            case "DOWN":
                result = "KITCHEN";
                break;
            default:
                System.out.println("Invalid Selection, try again.");
                result = moveChoices(input);
                break;
        }

        return result;
    }

    private String ballRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("RIGHT")) {
            result = "MOVIE ROOM";
        } else if (userChoice.toUpperCase().equals("LEFT")) {
            result = "HALL";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }

    private String movieRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("RIGHT")) {
            result = "STAIRS";
        } else if (userChoice.toUpperCase().equals("LEFT")) {
            result = "BALL ROOM";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }

    private String stairsRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Up, Down)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("UP")) {
            result = "MOVIE ROOM";
        } else if (userChoice.toUpperCase().equals("DOWN")) {
            result = "DOWN STAIRS HALL";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }

    private String downStairsHallRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("RIGHT")) {
            result = "STAIRS";
        } else if (userChoice.toUpperCase().equals("LEFT")) {
            result = "BEDROOM";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }

    private String bedroomRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left, Down)");
        String userChoice = scanner.nextLine();

        switch (userChoice.toUpperCase()) {
            case "RIGHT":
                result = "DOWN STAIRS HALL";
                break;
            case "LEFT":
                result = "KITCHEN";
                break;
            case "DOWN":
                result = "LIBRARY";
                break;
            default:
                System.out.println("Invalid Selection, try again.");
                result = moveChoices(input);
                break;
        }

        return result;
    }

    private String kitchenRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left, Up)");
        String userChoice = scanner.nextLine();

        switch (userChoice.toUpperCase()) {
            case "RIGHT":
                result = "BEDROOM";
                break;
            case "LEFT":
                result = "BATHROOM";
                break;
            case "UP":
                result = "HALL";
                break;
            default:
                System.out.println("Invalid Selection, try again.");
                result = moveChoices(input);
                break;
        }

        return result;
    }

    private String bathroomRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("RIGHT")) {
            result = "KITCHEN";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }

    private String libraryRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right, Left, Up)");
        String userChoice = scanner.nextLine();

        switch (userChoice.toUpperCase()) {
            case "RIGHT":
                result = "CAVE";
                break;
            case "LEFT":
                result = "LAB";
                break;
            case "UP":
                result = "BEDROOM";
                break;
            default:
                System.out.println("Invalid Selection, try again.");
                result = moveChoices(input);
                break;
        }

        return result;
    }

    private String labRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Left)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("LEFT")) {
            result = "LIBRARY";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }


    private String caveRoomChoices(String input) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (Right)");
        String userChoice = scanner.nextLine();

        if (userChoice.toUpperCase().equals("RIGHT")) {
            result = "LIBRARY";
        } else {
            System.out.println("Invalid Selection, try again.");
            result = moveChoices(input);
        }

        return result;
    }
}
