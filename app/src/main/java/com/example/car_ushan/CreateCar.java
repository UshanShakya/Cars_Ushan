package com.example.car_ushan;

public class CreateCar {
    private String make,year,color, price, engine;

    public CreateCar(String make, String year, String color, String price, String engine) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }

    public String  Create(){
        int count=0;
        String car;
        count= count+1;
        car=("The is Vehicle No. "+count+"\n"+" Manufacturer: "+make+" Current Value: "+price+ " Effective engine Size: "+engine+"\n");
        make=null;
        year=null;
        color=null;
        price=null;
        engine=null;
    return car;
    }
}
