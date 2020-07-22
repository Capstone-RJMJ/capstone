package com.rjmj.capstone.character;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZachTest {

    @Test
    public void answerWithAPositive() {
        Zach zach = new Zach();
        assertEquals("Recipe", zach.processQuestionAnswer("A"));
    }

    // These three tests pass, during the test run they will go straight into Scanner In with the question asked again.
    // This is the behavior that is designed, causing a "passing" test.
    @Test
    public void answerWithBNegative() {
        Zach zach = new Zach();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("B"));
    }

    @Test
    public void answerWithCNegative() {
        Zach zach = new Zach();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("C"));
    }

    @Test
    public void answerWithDNegative() {
        Zach zach = new Zach();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("D"));
    }
}
