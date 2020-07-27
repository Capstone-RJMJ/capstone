package com.rjmj.capstone;

import com.rjmj.capstone.player.Player;
import com.rjmj.capstone.player.Recipe;
import com.rjmj.capstone.room.GameTextArt;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Recipe r = new Recipe();
//        r.mixRandomRecipe();
        Player player = new Player();
        player.playGame(player.play());
//        r.setPlayerMix();
    }
}