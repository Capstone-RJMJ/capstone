package com.rjmj.capstone.room;
import static java.util.Map.entry;
import static java.util.Map.ofEntries;

import java.util.HashMap;
import java.util.Map;

public class Rooms {
    private Map<String,Map<String,String>> ROOMS = Map.ofEntries(
            entry("Dining Room", Map.of("item", "Syringe","character", "Nelly", "right", "Hall")),
            entry("Hall",Map.of( "right", "Dining Room", "left", "Ball Room", "down", "Kitchen")),
            entry("Ball Room", Map.of("item", "key","character", "John", "left", "hall", "right", "Movie Room")),
            entry("Movie Room", Map.of("item", "red liquid","character", "Jay", "left", "Ball Room", "right", "Stairs")),
            entry("Stairs", Map.of("item", "box", "left", "Down Stairs Hall", "back", "Movie Room")),
            entry("Down Stairs Hall", Map.of("item", "beaker", "left", "Bedroom", "right", "Stairs")),
            entry("Bedroom", Map.of("item", "green liquid", "left", "Library", "right", "Down Stairs Hall")),
            entry("Library", Map.of("character", "Peter", "left", "Cave", "right", "Lab")),
            entry("Cave", Map.of("item", "recipe","character", "Zach",  "right", "Library")),
            entry("Lab", Map.of("item", "needle", "left", "Library" )),
            entry("Kitchen",Map.of("item", "blue liquid","character", "Tom", "up", "Hall", "left", "bathroom")),
            entry("Bathroom",Map.of("item", "plunger", "right", "Kitchen"))
    );

    public Map<String, Map<String,String>> getROOMS() {
        return ROOMS;
    }

}
