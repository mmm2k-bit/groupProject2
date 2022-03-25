package com.group2;

import static java.lang.Math.round;

public abstract class Car {
    double carPrice;
    String color;

    public abstract double calculateSalePrice();

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
}
