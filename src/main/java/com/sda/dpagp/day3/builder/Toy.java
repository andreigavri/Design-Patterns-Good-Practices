package com.sda.dpagp.day3.builder;

public class Toy {

    private String name;
    private String description;
    private String color;
    private String madeOf;
    private int minAge;
    private int height;
    private int length;
    private int width;
    private int weight;

    // 1. make constructor private to control how objects are made
    private Toy(String name, String description, String color, String madeOf, int minAge, int height, int length, int width, int weight) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.madeOf = madeOf;
        this.minAge = minAge;
        this.height = height;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }


    // 2. declare a static class

    public static class ToyBuilder {

        // 3. declare each field of the class that we want to build (Toy in our case)
        private String name;
        private String description;
        private String color;
        private String madeOf;
        private int minAge;
        private int height;
        private int length;
        private int width;
        private int weight;

        // 4. declare setters for each of the field of this class.
        // Optional, setters can be made to return the builder type (ToyBuilder)
        public ToyBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ToyBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ToyBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ToyBuilder setMadeOf(String madeOf) {
            this.madeOf = madeOf;
            return this;
        }

        public ToyBuilder setMinAge(int minAge) {
            this.minAge = minAge;
            return this;
        }

        public ToyBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public ToyBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public ToyBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public ToyBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        // 5. declare a "build" method that creates the actual object
        public Toy build() {
            Toy newToy = new Toy(this.name, this.description, this.color, this.madeOf, this.minAge, this.height, this.length, this.width, this.weight);
            return newToy;
        }
    }

}
