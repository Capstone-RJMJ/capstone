package com.rjmj.capstone.timer;

import java.util.Timer;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.TimerTask;
//import javax.swing.Timer;

/**
 *Simple countdown timer demo of java.util.Timer facility.
 */

public class Countdown {
    private int delay = 1000; //milliseconds
    private Timer timer = new Timer();
    private int timeLeft = 60000;


    public void setTimeLeft() {
        setTimeLeft(getTimeLeft() - getDelay());
//        System.out.println(getTimeLeft());
    }

    public void startTimer(){
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                setTimeLeft();

                if (getTimeLeft()< 0) {
                    System.out.println("Game Over, times up your are dead");
                    timer.cancel();
                    System.exit(1);
                }
            }
        }, 0, 1000);
    }
    public void displayTimeLeft(){
        System.out.println(convertTimeLeftToMmSs(getTimeLeft()));
    }

    public static String convertTimeLeftToMmSs(int timeLeft) {
        int s = timeLeft % 60;
        int m = (timeLeft / 60) % 60;
//        long h = (seconds / (60 * 60)) % 24;
        return String.format("%02d:%02d", m,s);
    }


    public Timer getTimer() {
        return timer;
    }

    public int getDelay() {
        return delay;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

//    public static void main(final String args[]) {
//        if (args.length != 1) {
//            System.err.println("Usage: java Countdown <time in secs>");
//            System.exit(1);
//        }
//        final Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask() {
//            int i = Integer.parseInt(args[0]);
//            public void run() {
//                System.out.println(i--);
//                if (i< 0)
//                    timer.cancel();
//            }
//        }, 0, 6000);
//    }
}
