package com.company.devices;

import java.util.Objects;

public class Car extends Device{
    public Double millage;
    public Double engineVolume;
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearOfProduction) {
        super (model, producer, yearOfProduction);
    }
    @Override

    public String toString() {
        return "Car{"+
                "model= '" + model + '\'' +
                ", producer= '" + producer + '\'' +
                ", millage= " + millage +
                ", engine volume= " + engineVolume +
                ", color= '" + color + '\'' +
                '}';

    }
@Override
    public boolean equals(Object o) {
        if (this ==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.hashCode() == this.hashCode();
    }

@Override
    public int hashCode() {
        return Objects.hash(model, producer, millage, engineVolume, color, value);
    }
}
