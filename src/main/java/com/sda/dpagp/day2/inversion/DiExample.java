package com.sda.dpagp.day2.inversion;


public class DiExample {
    public static void main(String[] args) {
        //Car myCar = new Car(new V8Engine(), new AcUnit(), new LightsUnit());

        //Car myCar = new Car(new Engine(), new AcUnit(), new LightsUnit()); // Engine can be replace with any of its children, Livsko's substitution principle

        // engine can be replaced with an electric engine without changing anything in the Car class
        Car myCar = new Car(new ElectricEngine(), new AcUnit(), new LightsUnit()); // has an Engine



    }
}
