package com.rjmj.capstone.player;

import com.rjmj.capstone.timer.Countdown;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RecipeTest {
    List<Color> playerMix = new ArrayList(3);
    Countdown cd = new Countdown();
    Recipe recipe = new Recipe();

    @Before
    public void setUp() throws Exception {
        playerMix.add(Color.GREEN);
        playerMix.add(Color.RED);
        playerMix.add(Color.BLUE);

        recipe.colorMix.add(Color.GREEN);
        recipe.colorMix.add(Color.RED);
        recipe.colorMix.add(Color.BLUE);
    }

    @Test
    public void isRecipeMatchPositive() {
        boolean actual = recipe.isRecipeMatch(playerMix,cd);
        assertEquals(true,actual);
    }
    @Test
    public void isRecipeMatchNegative() {
        boolean actual = recipe.isRecipeMatch(playerMix,cd);
        assertNotEquals(true,actual);
    }
}