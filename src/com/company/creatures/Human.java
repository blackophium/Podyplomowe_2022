package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.Saleable;

import java.time.LocalDateTime;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Integer age;
    public Boolean isAlive;

    public Phone mobile;
    public Animal pet;
    public Car car;
    private Double salary;
    public Double cash;

    public void setCar(Car car){
        if(this.salary > car.value){
            System.out.println("Kupiony za gotowke: "+car.model);
            this.car=car;
        } else if (this.salary> car.value /12.0) {
            System.out.println("Kupiony na kredyt:" + car.model);
            this.car=car;
        } else {
            System.out.println("Nie masz pieniedzy.");
        }
    }

    public Human(){
        super("homo sapiens");
    }
    public Car getCar() {
        return this.car;
    }

    public double getSalary(){
            System.out.println("Dane o wypłacie z dnia: " + LocalDateTime.now());
            return this.salary;
        }

    public void setSalary(Double salary) {
        if (salary<0){
            System.out.println("Brak wyplaty.");
        }else{
            System.out.println("Nowa wyplata wyslana do ksiegowego.");
            System.out.println("Odbierz aneks");
            this.salary = salary;
        }
    }

    public String toString(){
        return this.firstName + " " + this.lastName + "lat" + age;
    }

}
