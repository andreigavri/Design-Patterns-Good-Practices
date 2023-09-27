package com.sda.dpagp.day1;

public class Example1 {
    public static void main(String[] args) {
        Person_WRONG person1 = new Person_WRONG("Gabriel" , "Alexandru ",21);
        person1.eat();
        person1.drink();
        person1.work();

        Person person2 = new Person("Gabriel","Alexandru", "Bucuresti", "boss","0777", 165, 30);
        person2.eat();
        person2.drink();
        person2.work();

    }
}