package com.rjmj.capstone.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void stringCorrectPlayerName() {
        Player playerCorrect = new Player("RJ");
        assertEquals("RJ", playerCorrect.getPlayerName());
    }

    @Test
    public void integerCorrectPlayerName() {
        Player playerCorrect = new Player("123");
        assertEquals("123", playerCorrect.getPlayerName());
    }

    @Test
    public void floatCorrectPlayerName() {
        Player playerCorrect = new Player("123.12");
        assertEquals("123.12", playerCorrect.getPlayerName());
    }

    @Test
    public void incorrectPlayerName() {
        Player playerIncorrect = new Player("Hello");
        assertNotEquals("RJ", playerIncorrect.getPlayerName());
    }

    @Test
    public void movementTesting() {
        Player player = new Player("Hello", "LOOK AROUND");
        assertEquals("LOOK AROUND", player.getPlayerActionSelection());
    }

    @Test
    public void movementIncorrect() {
        Player player = new Player("Hello", "DONT LOOK AROUND");
        assertNotEquals("LOOK AROUND", player.getPlayerActionSelection());
    }
}