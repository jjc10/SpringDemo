package com.example.spring_demo.model.instrument;

public class Instrument {

    private String type; // string, percussion, wind etc...
    private String name; // guitar, conga, didgeridoo
    private double price;
    private String brand;
    private String model;

    public Instrument(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Instrument(String type, String name, double price, String brand, String model) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public void play() {
        System.out.println("I'm a generic instrument");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
