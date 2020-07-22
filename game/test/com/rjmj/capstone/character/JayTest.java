package com.rjmj.capstone.character;

import org.junit.Test;

import static org.junit.Assert.*;

public class JayTest {

    @Test
    public void answerWithCNegative() {
        Jay zach = new Jay();
        assertEquals("Red Liquid", zach.processQuestionAnswer("C"));
    }

    // These three tests pass, during the test run they will go straight into Scanner In with the question asked again.
    // This is the behavior that is designed, causing a "passing" test.
    @Test
    public void answerWithBNegative() {
        Jay zach = new Jay();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("B"));
    }

    @Test
    public void answerWithANegative() {
        Jay zach = new Jay();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("A"));
    }

    @Test
    public void answerWithDNegative() {
        Jay zach = new Jay();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("D"));
    }
}