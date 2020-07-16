package com.rjmj.capstone;

import com.rjmj.capstone.room.Rooms;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main Entry Point");
        Rooms rooms = new Rooms();
        System.out.println(rooms.getROOMS().get("Dining Room").get("item")); // Syringe
        System.out.println(rooms.getROOMS().get("Dining Room").get("right")); // Hall
        System.out.println(rooms.getROOMS().get("Cave").get("character")); // John
    }
}
