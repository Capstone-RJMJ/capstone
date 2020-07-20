package com.rjmj.capstone.player;


import com.rjmj.capstone.character.*;
import com.rjmj.capstone.room.Rooms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Inventory {

        Jay jay = new Jay();
        John john = new John();
        Tom tom = new Tom();
        Nelly nelly = new Nelly();
        Zach zach = new Zach();
        Peter peter = new Peter();

        private ArrayList<String> plyrInv = new ArrayList<>();


    public String talkToCharacter(Rooms room, String currentRoom, Inventory inventory) throws IOException {
        String item;
        Map<String,String> rm = room.getROOMS().get(currentRoom);
        if(rm.get("character") != null){
            String character = rm.get("character");

            switch (character) {
                case "Tom":
                    item = tom.askQuestion();
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Jay":
                    item = jay.askQuestion();
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "John":
                    item = john.askQuestion();
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Peter":
                    item = peter.askQuestion();
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Zach":
                    item = zach.askQuestion();
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Nelly":
                    item = nelly.askQuestion();
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
            }
        }
        else {
            System.out.println("No one is around, you say hello to yourself.\n");
    }
        return "item";//return the item i guess
    }
    public void inventoryMsg(String item, int num){
        System.out.println("The " + item + " was added to your inventory\n" +
                "You now have " + num + " items in your inventory:");
    }

    public ArrayList<String> getPlyrInv() {
        return plyrInv;
    }

    public void setPlyrInv(String item) {
        plyrInv.add(item);
    }
}