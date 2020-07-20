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

        private ArrayList<String> plyrInv = new ArrayList<String>();
//        plyrInv.add(jay.askQuestion());
//        plyrInv.add(john.askQuestion());
//        plyrInv.add(tom.askQuestion());
//        plyrInv.add(nelly.askQuestion());
//        plyrInv.add(zach.askQuestion());
//        plyrInv.add(peter.askQuestion());
//        plyrInv.add(nelly.askQuestion());


    public String talkToCharacter(Rooms room, String currentRoom) throws IOException {
        Map<String,String> rm = room.getROOMS().get(currentRoom);
        if(rm.get("character") != null){
            String character = rm.get("character");

            switch (character) {
                case "Tom":
                    tom.askQuestion();
                    break;
                case "Jay":
                    jay.askQuestion();
                    break;
                case "John":
                    john.askQuestion();
                    break;
                case "Peter":
                    peter.askQuestion();
                    break;
                case "Zach":
                    zach.askQuestion();
                    break;
                case "Nelly":
                    nelly.askQuestion();
                    break;
            }
        }
        else {
            System.out.println("No one is around, you say hello to yourself.\n");
    }
        return "item";//return the item i guess
    }

    public ArrayList<String> getPlyrInv() {
        return plyrInv;
    }

    public void setPlyrInv(String item) {
        plyrInv.add(item);
    }
}