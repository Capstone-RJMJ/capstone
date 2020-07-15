package com.rjmj.capstone.room;

public class Hall implements Room{
    public static Room left = new DiningRoom();
    public static Room right = new BallRoom();
    public static Room up = null;
    public static Room down = new Kitchen();
}
