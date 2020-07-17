package com.rjmj.capstone.room;
import static java.util.Map.entry;
import static java.util.Map.ofEntries;

import java.util.Map;
import java.util.Set;

public class Rooms {
    private Map<String,Map<String,String>> ROOMS = Map.ofEntries(
            entry("Dining Room", Map.of(
                    "room", "Dining Room",
                    "item", "Syringe",
                    "character", "Nelly",
                    "right", "Hall")),
            entry("Hall",Map.of(
                    "room", "Hall",
                    "right", "Ball Room",
                    "left", "Dining Room",
                    "down", "Kitchen")),
            entry("Ball Room", Map.of(
                    "room", "Ball Room",
                    "item", "key",
                    "character", "John",
                    "left", "hall",
                    "right", "Movie Room")),
            entry("Movie Room", Map.of("room",
                    "Movie Room","item", "red liquid",
                    "character", "Jay",
                    "left", "Ball Room",
                    "right", "Stairs")),
            entry("Stairs", Map.of(
                    "room", "Stairs",
                    "item", "box",
                    "left", "Down Stairs Hall",
                    "back", "Movie Room")),
            entry("Down Stairs Hall", Map.of(
                    "room", "Down Stairs Hall",
                    "item", "beaker",
                    "left", "Bedroom",
                    "right", "Stairs")),
            entry("Bedroom", Map.of(
                    "room", "Bedroom",
                    "item", "green liquid",
                    "left", "Library",
                    "right", "Down Stairs Hall")),
            entry("Library", Map.of(
                    "room", "Library",
                    "character", "Peter",
                    "left", "Cave",
                    "right", "Lab")),
            entry("Cave", Map.of(
                    "room", "Cave",
                    "item", "recipe",
                    "character", "Zach",
                    "right", "Library")),
            entry("Lab", Map.of(
                    "room", "Lab",
                    "item", "needle",
                    "left", "Library" )),
            entry("Kitchen",Map.of(
                    "room", "Kitchen",
                    "item", "blue liquid",
                    "character", "Tom",
                    "up", "Hall",
                    "left", "bathroom")),
            entry("Bathroom",Map.of(
                    "room", "Bathroom",
                    "item", "plunger",
                    "right", "Kitchen"))
    );

    public String lookAround(Rooms room, String currentRoom) {

        Map<String,String> rm = room.getROOMS().get(currentRoom);
        StringBuilder sb = new StringBuilder();
        sb.append("As you look around the " + currentRoom + ", ");
        Set<String> keys = rm.keySet();
        String[] keyArr = keys.toArray(new String[keys.size()]);
        for(String key : keyArr) {
            if (rm.get("item") != null && "item".equals(key)) {
                String item = rm.get("item");
                sb.append("you see a " + item + "\n");
            }
            if (rm.get("character") != null && "character".equals(key)) {
                String character = rm.get("character");
                sb.append(character + " is in the room\n");
            }
            if (rm.get("left") != null && "left".equals(key)) {
                String left = rm.get("left");
                sb.append("a door to the " + rm.get("left") + " is to the LEFT\n");
            }
            if (rm.get("right") != null && "right".equals(key)) {
                String right = rm.get("right");
                sb.append("a door to the " + rm.get("right") + " is to the RIGHT\n");
            }
            if (rm.get("up") != null && rm.get("up").equals(key)) {
                String up = rm.get("up");
                sb.append("a door to the " + rm.get("up") + " is UP from the " + currentRoom+ "\n");
            }
            if (rm.get("down") != null && rm.get("down").equals(key)) {
                String down = rm.get("down");
                sb.append("a door to the " + rm.get("down") + " is DOWN from the " + currentRoom + "\n");
            }
        }
        String result = sb.toString();
        System.out.println(result);
        return result;
    }

    public Map<String, Map<String,String>> getROOMS() {
        return ROOMS;
    }

}
