package com.sda.dpagp.day1;

public class Person_WRONG {
    String firstName;
    String surName;
    int age;

    public Person_WRONG(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public void eat() {
        String message = "My name is " + surName + firstName + " and i am going to eat!";
        System.out.println(message);
    }

    public void drink() {
        String meassage2 = "My name is " + surName + firstName + " and i am going to drink!";
        System.out.println(meassage2);
    }

    public void work() {
        String message = "My name is " + surName + firstName + " and i am going to work!";
        System.out.println(message);
    }
}