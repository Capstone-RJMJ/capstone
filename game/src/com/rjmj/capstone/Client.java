package com.rjmj.capstone;

import com.rjmj.capstone.player.Player;
import com.rjmj.capstone.room.GameTestArt;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        GameTestArt gameTestArt = new GameTestArt();

        player.playGame();
    }
}