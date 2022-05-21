package com.company;

import com.company.Saleable;
import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Device;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Pet cat = new Pet("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        Human aga = new Human();
        aga.age = 99;

        aga.setSalary(1000.0);
        System.out.println(aga.getSalary());

        Car fiat = new Car("bravo", "fiat", 2021);
        fiat.value = 500.0;

        aga.setCar(fiat);
        aga.isAlive = false;

        aga.firstName = "Agnieszka";
        aga.lastName = "Szatkowska";
        aga.pet = dog;
        aga.mobile = new Phone("6s", "apple", 2018);

        aga.pet.feed();

        System.out.println(aga.getCar());
        System.out.println(aga);

        Car pasat1 = new Car("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        Car pasat2 = new Car("pasat", "vw", 2001);
        pasat2.value = 1300.0;

        System.out.println(pasat1.hashCode());
        System.out.println(pasat2.hashCode());

        if (pasat1.equals(pasat2)) {
            System.out.println("to samo auto");
        } else {
            System.out.println("inne auto");
        }

        aga.feed();
        System.out.println(aga.species);

        // Device fridge = new Device("S47632", "samsung", 2021);

        System.out.println(pasat1 instanceof Car);
        System.out.println(pasat1 instanceof Device);

        System.out.println(pasat1);

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 3000.0;

        try{
            pasat1.sell(aga, brotherInLaw, 1000.0);
        } catch (Exception e){
            System.out.println("Nie udało się sprzedać "+pasat1);
            e.printStackTrace();
        }
        try{
            fiat.sell(aga, brotherInLaw, 1000.0);
        } catch (Exception e){
            System.out.println("Nie udało się sprzedać "+fiat);
            e.printStackTrace();
        }
        try{
            pasat2.sell(aga, brotherInLaw, 1000.0);
        } catch (Exception e){
            System.out.println("Nie udało się sprzedać "+pasat2);
            e.printStackTrace();
        }

        System.out.println("Samochód szwagra: " + brotherInLaw.getCar());
        System.out.println("Samochód Agi: " + brotherInLaw.getCar());

        Human sister = new Human();
        sister.cash = 5000.0;

        Phone nokia = new Phone("6410", "Nokia", 2000);
        nokia.installAnApp("Youtube", "2", "SklepPlay");
    }
}