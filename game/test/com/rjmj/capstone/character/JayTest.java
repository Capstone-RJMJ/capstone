package com.rjmj.capstone.character;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JayTest {

    @Test
    public void answerWithCNegative() throws IOException, InterruptedException {
        Jay zach = new Jay();
        assertEquals("Red Liquid", zach.processQuestionAnswer("C"));
    }

    // These three tests pass, during the test run they will go straight into Scanner In with the question asked again.
    // This is the behavior that is designed, causing a "passing" test.
    @Test
    public void answerWithBNegative() throws IOException, InterruptedException {
        Jay zach = new Jay();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("B"));
    }

    @Test
    public void answerWithANegative() throws IOException, InterruptedException {
        Jay zach = new Jay();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("A"));
    }

    @Test
    public void answerWithDNegative() throws IOException, InterruptedException {
        Jay zach = new Jay();
        assertEquals("\"Incorrect, please try again.\"", zach.processQuestionAnswer("D"));
    }
}