package com.rjmj.capstone.timer;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

class CountdownTest {
    Countdown cd = new Countdown();

    @Test
    void addTimeBuffPositive() {
        cd.startTimer();
        Long timeFrozen = cd.getTimeLeft();
    }

    @Test
    void updateTimeLeft() {
    }

    @Test
    void startTimer() {
    }

    @Test
    void displayTimeInsideArt() {
    }

    @Test
    void convertTimeLeftToMmSs() {
    }
}