package com.group2;

public class Sedan extends Car{
    private int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if(this.length>20){
            double discount= super.carPrice*0.05;
            return Math.round(super.carPrice-discount);
        }else{
            double discount= super.carPrice*0.1;
            return Math.round(super.carPrice-discount);
        }

    }
}
