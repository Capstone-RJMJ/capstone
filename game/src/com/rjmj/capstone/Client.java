package com.rjmj.capstone;

import com.rjmj.capstone.player.Player;
import com.rjmj.capstone.room.Rooms;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        Rooms startingRoom = new Rooms();

        player.availableActions();
    }
}