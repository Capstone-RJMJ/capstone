package com.rjmj.capstone.engines;

import com.rjmj.capstone.engine.UserInput;
import com.rjmj.capstone.player.Inventory;
import com.rjmj.capstone.room.Rooms;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MovementEngine {
    private String currentRoom = "DINING ROOM";
    private Rooms room = new Rooms();


    private String questionBuilder(){
        StringBuilder sb = new StringBuilder("Which direction would you like to go? (");
        String left,right,down,up;
        Map<String,String> rm = getRoom().getROOMS().get(getCurrentRoom());
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

    public String roomChoices(){
        UserInput input = new UserInput();
        String userChoice = input.getInput(questionBuilder());
        return userChoice;
    }

    public String changeRoom(Inventory inventory, String userChoice) throws IOException, InterruptedException {
        String result = getCurrentRoom();
        Map<String,String> rm = getRoom().getROOMS().get(getCurrentRoom());
        if(rm.get("room").equals("Bedroom") && userChoice.equals("left")){
            inventory.talkToCharacter(getRoom(),"LIBRARY",inventory);// force talking to Peter when going into Library
        }
        if(rm.containsKey(userChoice)) {
            setCurrentRoom(rm.get(userChoice).toUpperCase());
            result = rm.get(userChoice).toUpperCase();
        }
        else {
            System.out.println("Invalid Selection, try again.");
            roomChoices();
        }

        return result;
    }
    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Rooms getRoom() {
        return room;
    }

}