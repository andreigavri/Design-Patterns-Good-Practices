package com.sda.dpagp.day1;

public class Person {
    private String firstName;
    private String surname;
    private String address;
    private String job;
    private String phoneNumber;
    private double height;
    private int age;

    public Person(String firstName, String surname, String address, String job, String phoneNumber, double height, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.age = age;
    }

    public void eat() {
        printAction("eating");
    }

    public void drink() {
        printAction("drinking");
    }

    public void work() {
        printAction("working");
    }

    private void printAction(String action) {
        String message = String.format("My name is %s %s and I'm %s!", firstName, surname, action);
        System.out.println(message);
    }
}