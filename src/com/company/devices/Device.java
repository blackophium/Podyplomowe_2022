package com.company.devices;

public class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }

    public void turnOn(){
        System.out.println("Włączam...");
    }
}
