package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw", "x3", 2020);

        car.testDrive();
        System.out.println(car.getSpeed());
    }
}