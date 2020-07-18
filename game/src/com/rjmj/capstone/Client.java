package com.rjmj.capstone;

import com.rjmj.capstone.player.Player;
import com.rjmj.capstone.room.Rooms;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        Rooms startingRoom = new Rooms();

        player.availableActions();
    }
}
