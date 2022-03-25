package com.group2;

public class Truck extends Car{
    private int weight;

    public Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if(this.weight>2000){
            double discount= super.carPrice*0.1;
            return Math.round(super.carPrice-discount);
        }else{
            double discount= super.carPrice*0.1;
            return Math.round(super.carPrice-discount);
        }
    }
}
