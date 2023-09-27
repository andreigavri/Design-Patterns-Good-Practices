package com.sda.dpagp.day2.singleton;

public class CounterExample {


    public static void main(String[] args) {
        Counter couter = Counter.getInstance();

        System.out.println(couter.incrementAndGet()); // 1
        System.out.println(couter.incrementAndGet()); // 2
        System.out.println(couter.incrementAndGet()); // 3
        System.out.println(couter.incrementAndGet()); // 4

        // Todo: homework, try to use counter in Book & CDs classes and Example2
    }
}
