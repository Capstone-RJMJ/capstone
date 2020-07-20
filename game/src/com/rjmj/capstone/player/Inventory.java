package com.rjmj.capstone.player;


import com.rjmj.capstone.character.*;

import java.io.IOException;
import java.util.ArrayList;

public class Inventory {
    public static void main(String[] args) throws IOException {

        Jay jay = new Jay();
        John john = new John();
        Tom tom = new Tom();
        Nelly nelly = new Nelly();
        Zach zach = new Zach();
        Peter peter = new Peter();

        ArrayList<String> plyrInv = new ArrayList<String>();
        plyrInv.add(jay.askQuestion());
        plyrInv.add(john.askQuestion());
        plyrInv.add(tom.askQuestion());
        plyrInv.add(nelly.askQuestion());
        plyrInv.add(zach.askQuestion());
        plyrInv.add(peter.askQuestion());
        plyrInv.add(nelly.askQuestion());

        System.out.println(plyrInv);
        //for (int i = 0; i < plyrInv.size(); i++) {
        //   System.out.println(plyrInv.get(i));
        //}

    }
}