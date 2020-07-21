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
                    item = tom.processQuestionAnswer(tom.askTheQuestionAndCollectInput());
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Jay":
                    item = jay.processQuestionAnswer(jay.askTheQuestionAndCollectInput());
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "John":
                    item = john.processQuestionAnswer(john.askTheQuestionAndCollectInput());
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Peter":
                    System.out.println("\nPeter is standing at the entrance to the Library.  " +
                            "He will not let you continue unless you correctly answer this math question:\n");
                    item = peter.processQuestionAnswer(peter.askTheQuestionAndCollectInput());
                    System.out.println("\nPeter has granted you access to the LAB " +
                            "and there is a secret CAVE behind the bookshelves!!!\n");
                    break;
                case "Zach":
                    item = zach.processQuestionAnswer(zach.askTheQuestionAndCollectInput());
                    if (!inventory.getPlyrInv().contains(item)) {
                        inventory.setPlyrInv(item);
                        inventoryMsg(item, inventory.getPlyrInv().size());
                    }
                    break;
                case "Nelly":
                    item = nelly.processQuestionAnswer(nelly.askTheQuestionAndCollectInput());
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