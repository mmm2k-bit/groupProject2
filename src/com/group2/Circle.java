package com.group2;

import static java.lang.Math.PI;

public class Circle implements IShape{
    @Override
    public double calculateArea(double value) {
        double power = Math.pow(value,2);
        double areaCircle = power * PI;
        return areaCircle;
    }

    @Override
    public double calculatePerimeter(double value2) {
        return value2*PI*2;
    }
}
