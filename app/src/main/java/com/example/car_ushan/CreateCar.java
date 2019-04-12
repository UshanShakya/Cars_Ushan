package com.example.car_ushan;

public class CreateCar {
    private String make, year, color, price, engine, Answer;
    private int count;
    public CreateCar(String make, String year, String color, String price, String engine, int count) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.count = count;
    }

    public String CreatesCar(){


        Answer= "The is Vehicle No. "+count+"\n"+" Manufacturer: "+make+" Current Value: "+price+ " Effective engine Size: "+engine+"\n";
        return Answer;

    }
}
