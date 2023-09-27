package com.sda.dpagp.day2.singleton;

public final class Counter {

    private static final Counter instance = new Counter();

    private int totalCounts = 0;

    private Counter(){
        // don't allow the class to be instantiated from outside
    }

    public static Counter getInstance() {
        return instance;
    }

    public int incrementAndGet() {
        // increment
        totalCounts = totalCounts + 1; // or totalCounts++
        // ... and "get" (return)
        return totalCounts;
    }

}
