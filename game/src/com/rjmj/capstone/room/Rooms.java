package com.rjmj.capstone.room;
import static java.util.Map.entry;
import static java.util.Map.ofEntries;

import java.util.Map;

public class Rooms {
    private Map<String,Map<String,String>> ROOMS = Map.ofEntries(
            entry("Dining Room", Map.of("room", "Dining Room","item", "Syringe","character", "Nelly", "right", "Hall")),
            entry("Hall",Map.of( "room", "Hall","right", "Dining Room", "left", "Ball Room", "down", "Kitchen")),
            entry("Ball Room", Map.of("room", "Ball Room","item", "key","character", "John", "left", "hall", "right", "Movie Room")),
            entry("Movie Room", Map.of("room", "Movie Room","item", "red liquid","character", "Jay", "left", "Ball Room", "right", "Stairs")),
            entry("Stairs", Map.of("room", "Stairs","item", "box", "left", "Down Stairs Hall", "back", "Movie Room")),
            entry("Down Stairs Hall", Map.of("room", "Down Stairs Hall","item", "beaker", "left", "Bedroom", "right", "Stairs")),
            entry("Bedroom", Map.of("room", "Bedroom","item", "green liquid", "left", "Library", "right", "Down Stairs Hall")),
            entry("Library", Map.of("room", "Library","character", "Peter", "left", "Cave", "right", "Lab")),
            entry("Cave", Map.of("room", "Cave","item", "recipe","character", "Zach",  "right", "Library")),
            entry("Lab", Map.of("room", "Lab","item", "needle", "left", "Library" )),
            entry("Kitchen",Map.of("room", "Kitchen","item", "blue liquid","character", "Tom", "up", "Hall", "left", "bathroom")),
            entry("Bathroom",Map.of("room", "Bathroom","item", "plunger", "right", "Kitchen"))
    );

    public Map<String, Map<String,String>> getROOMS() {
        return ROOMS;
    }

}
