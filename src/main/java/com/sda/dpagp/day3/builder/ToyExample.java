package com.sda.dpagp.day3.builder;

public class ToyExample {

    public static void main(String[] args) {
        Toy.ToyBuilder toyBuilder = new Toy.ToyBuilder();

        Toy toy1 = toyBuilder
                .setColor("rosu")
                .setName("mine")
                .setMadeOf("plastic")
                .build(); // this is the last step that actually builds our object (Toy)

        Toy toy2 = toyBuilder.setName("masinuta")
                .setDescription("perfecta pt copilul din tine")
                .setMadeOf("plastic")
                .setMinAge(18)
                .setHeight(40)
                .setLength(70)
                .setWidth(40)
                .setWeight(5000)
                .build();

        Toy toy3 = toyBuilder.setName("papusa barbie")
                .setDescription("o jucarie clasica")
                .setMadeOf("plastic")
                .setMinAge(3)
                .setHeight(20)
                .setLength(5)
                .setWidth(8)
                .setWeight(120)
                .build();
    }
}
