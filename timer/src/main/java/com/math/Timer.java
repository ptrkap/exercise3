package com.math;

public class Timer {

    public static void main(String[] args) {
        System.out.println("Timer started");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) { }
    }
}
