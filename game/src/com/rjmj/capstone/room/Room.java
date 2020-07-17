package com.rjmj.capstone.room;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Room {
    DINING_ROOM, HALL, BALL_ROOM, MOVIE_ROOM, STAIRS, DOWN_STAIRS_HALL, BEDROOM, LIBRARY, CAVE, LAB, KITCHEN, BATHROOM;

    public List<Room> possibleRightMovement;
    public List<Room> possibleLeftMovement;
    public List<Room> possibleDownMovement;
    public List<Room> possibleUpMovement;

    public boolean canMoveRight(Room input) {
        return possibleRightMovement.contains(input);
    }

    public boolean canMoveLeft(Room input) {
        return possibleLeftMovement.contains(input);
    }

    public boolean canMoveDown(Room input) {
        return possibleDownMovement.contains(input);
    }

    public boolean canMoveUp(Room input) {
        return possibleUpMovement.contains(input);
    }

    // This will handle the possible right movement
    static {
        DINING_ROOM.possibleRightMovement = Collections.singletonList(HALL);
        HALL.possibleRightMovement = Collections.singletonList(BALL_ROOM);
        BALL_ROOM.possibleRightMovement = Collections.singletonList(MOVIE_ROOM);
        MOVIE_ROOM.possibleRightMovement = Collections.singletonList(STAIRS);
        DOWN_STAIRS_HALL.possibleRightMovement = Collections.singletonList(STAIRS);
        BEDROOM.possibleRightMovement = Collections.singletonList(DOWN_STAIRS_HALL);
        LIBRARY.possibleRightMovement = Collections.singletonList(LAB);
        CAVE.possibleRightMovement = Collections.singletonList(LIBRARY);
        BATHROOM.possibleRightMovement = Collections.singletonList(KITCHEN);
    }

    // This will handle the possible left movement
    static {
        HALL.possibleLeftMovement = Collections.singletonList(DINING_ROOM);
        BALL_ROOM.possibleLeftMovement = Collections.singletonList(HALL);
        MOVIE_ROOM.possibleLeftMovement = Collections.singletonList(BALL_ROOM);
        STAIRS.possibleLeftMovement = Collections.singletonList(DOWN_STAIRS_HALL);
        DOWN_STAIRS_HALL.possibleLeftMovement = Collections.singletonList(BEDROOM);
        BEDROOM.possibleLeftMovement = Collections.singletonList(LIBRARY);
        LAB.possibleLeftMovement = Collections.singletonList(LIBRARY);
        KITCHEN.possibleLeftMovement = Collections.singletonList(BATHROOM);
    }

    // This will handle the possible down movement
    static {
        HALL.possibleDownMovement = Collections.singletonList(KITCHEN);
        STAIRS.possibleDownMovement = Collections.singletonList(MOVIE_ROOM);
    }

    // This will handle the possible up movement
    static {
        KITCHEN.possibleUpMovement = Collections.singletonList(HALL);
    }
}
