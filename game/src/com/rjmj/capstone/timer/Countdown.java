package com.rjmj.capstone.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Countdown {
    private long delay = 1000; //milliseconds
    private Timer timer = new Timer();
    private long timeLeft = 600000;
    private long timeBuff = 60000;

    public void addTimeBuff(){
        setTimeLeft(getTimeLeft() + getTimeBuff());
    }

    public void updateTimeLeft() {
        setTimeLeft(getTimeLeft() - getDelay());
    }

    public void startTimer() {
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                updateTimeLeft();
                if (getTimeLeft() < 0) {
                    System.out.println("Game Over, times up your are dead");
                    timer.cancel();
                    System.exit(1);
                }
            }
        }, 0, 1000);
    }

    public void displayTimeLeft() {
        System.out.println("Time remaining: " + convertTimeLeftToMmSs(getTimeLeft()) + "\n");
    }
    
    public String displayTimeInsideArt() {
        return "Time remaining: " + convertTimeLeftToMmSs(getTimeLeft());
    }

    public static String convertTimeLeftToMmSs(long timeLeft) {
        String ms = String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(timeLeft) % TimeUnit.HOURS.toMinutes(1),
                TimeUnit.MILLISECONDS.toSeconds(timeLeft) % TimeUnit.MINUTES.toSeconds(1));
        return ms;
    }

    public long getDelay() {
        return delay;
    }

    public long getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(long timeLeft) {
        this.timeLeft = timeLeft;
    }

    public long getTimeBuff() {
        return timeBuff;
    }
}