package com.rjmj.capstone.player;


import com.rjmj.capstone.character.*;
import com.rjmj.capstone.engines.MovementEngine;
import com.rjmj.capstone.room.Rooms;
import com.rjmj.capstone.timer.Countdown;

import java.io.IOException;
import java.lang.Character;
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


    // TODO: Uncomment out the inventoryMsg and each display of them if the Ascii Art panel is scrapped.
    // TODO: Currently they are commented to allow for the display to give all of the UI information.

    public String talkToCharacter(Rooms room, String currentRoom, Inventory inventory, Countdown cd) throws IOException, InterruptedException {
        MovementEngine movementEngine = new MovementEngine();
        movementEngine.clearScreen();
        String item = "";
        Map<String,String> rm = room.getROOMS().get(currentRoom);
        if(rm.get("character") != null){
            String character = rm.get("character");

            switch (character) {
                case "Tom":
                    item = tom.processQuestionAnswer(tom.askTheQuestionAndCollectInput());
                    if (item.equals(tom.getItem())) {
                        if (!inventory.getPlyrInv().contains(item)) {
                            inventory.setPlyrInv(item);
                            item = "Tom has given you " + item;
                        //    inventoryMsg(item, inventory.getPlyrInv().size());
                        }
                    } else {
                        talkToCharacter(room, currentRoom, inventory, cd);
                    }
                    break;
                case "Jay":
                    item = jay.processQuestionAnswer(jay.askTheQuestionAndCollectInput());
                    if (item.equals(jay.getItem())) {
                        if (!inventory.getPlyrInv().contains(item)) {
                            inventory.setPlyrInv(item);
                            item = "Jay has given you " + item;
                        //    inventoryMsg(item, inventory.getPlyrInv().size());
                        }
                    } else {
                        talkToCharacter(room, currentRoom, inventory, cd);
                    }
                    break;
                case "John":
                    item = john.processQuestionAnswer(john.askTheQuestionAndCollectInput());
                    if (item.equals(john.getItem())) {
                        if (!inventory.getPlyrInv().contains(item)) {
                            inventory.setPlyrInv(item);
                            item = "John has given you a " + item;
                            if (inventory.getPlyrInv().contains("Box")){
                                cd.addTimeBuff();
                            }
                        //    inventoryMsg(item, inventory.getPlyrInv().size());
                        }
                    } else {
                        talkToCharacter(room, currentRoom, inventory, cd);
                    }
                    break;
                case "Peter":
                    item = peter.processQuestionAnswer(peter.askTheQuestionAndCollectInput());
                    if (item.equals(peter.getItem())) {
                        item = "\nPeter has granted you access to the Library " +
                                "and there is a secret CAVE behind the bookshelves!!!\n" +
                                "and a Lab behind another set of books.";
                    } else {
                        talkToCharacter(room, currentRoom, inventory,cd);
                    }
                    break;
                case "Zach":
                    item = zach.processQuestionAnswer(zach.askTheQuestionAndCollectInput());
                    if (item.equals(zach.getItem())) {
                        if (!inventory.getPlyrInv().contains(item)) {
                            inventory.setPlyrInv(item);
                            item = Recipe.recipeArt();
                        //    inventoryMsg(item, inventory.getPlyrInv().size());
                        }
                    } else {
                        talkToCharacter(room, currentRoom, inventory, cd);
                    }
                    break;
                case "Nelly":
                    item = nelly.processQuestionAnswer(nelly.askTheQuestionAndCollectInput());
                    if (item.equals(nelly.getItem())) {
                        if (!inventory.getPlyrInv().contains(item)) {
                            inventory.setPlyrInv(item);
                            //   inventoryMsg(item, inventory.getPlyrInv().size());
                        }
                    } else {
                        talkToCharacter(room, currentRoom, inventory,cd);
                    }
                    break;
            }
        }
        else {
            System.out.println("No one is around, you say hello to yourself.\n");
    }
        return item;//return the item i guess
    }
//    public void inventoryMsg(String item, int num){
//        System.out.println("The " + item + " was added to your inventory\n" +
//                "You now have " + num + " items in your inventory:");
//        for (String playerItems : getPlyrInv()) {
//            System.out.println("- " + playerItems);
//        }
//    }

    public ArrayList<String> getPlyrInv() {
        return plyrInv;
    }

    public void setPlyrInv(String item) {
        plyrInv.add(item);
    }

    public String textArtDisplayInventory() {
        String result = "";
        for (String playerItems : getPlyrInv()) {
            result = playerItems;
        }
        return result;
    }
}