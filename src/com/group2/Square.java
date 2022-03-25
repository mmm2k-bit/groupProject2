package com.group2;

import static java.lang.Math.PI;

public class Square implements IShape{
    @Override
    public double calculateArea(double value) {
        double areaSquare = Math.pow(value,2);
        return areaSquare;
    }

    @Override
    public double calculatePerimeter(double value2) {
        return 4*value2;
    }
}
