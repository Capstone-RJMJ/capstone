package com.rjmj.capstone;

import com.rjmj.capstone.player.Player;
import com.rjmj.capstone.room.Rooms;
import com.rjmj.capstone.timer.Countdown;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
//        Countdown cd = new Countdown();
//        cd.startTimer();
        player.collectPlayerName();
        player.availableActions();
    }
}