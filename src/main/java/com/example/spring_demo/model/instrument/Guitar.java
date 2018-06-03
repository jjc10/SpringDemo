package com.example.spring_demo.model.instrument;

public class Guitar extends Instrument {


    public Guitar(double price, String brand, String model) {
        super("string", "guitar", price, brand, model);

    }

    @Override
    public void play() {
        System.out.println("I'm a guitar of brand: " + this.getBrand() + " model: " + this.getModel());
    }

}
