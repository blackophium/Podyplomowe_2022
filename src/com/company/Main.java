package com.company;

import com.company.creatures.*;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;

import java.util.*;

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

        System.out.println("Pet.toString():" + cat);

        Human aga = new Human();
        aga.age = 99;

        aga.setSalary(1000.0);
        System.out.println(aga.getSalary());

        Car fiat = new Diesel("bravo", "fiat", 2021);
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

        Car pasat1 = new Diesel("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        Car pasat2 = new Diesel("pasat", "vw", 2001);
        pasat2.value = 1300.0;

        System.out.println(pasat1.hashCode());
        System.out.println(pasat2.hashCode());

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 1300.0;

        Phone nokia = new Phone("6410", "Nokia", 2000);
        nokia.installAnApp("YouTube");

        Human sister = new Human();
        sister.cash = 5000.0;

        sister.takeForAWalk();

        System.out.println(nokia);

        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = aga;
        animals[3] = new FarmAnimal("cow");

        System.out.println("Zwierzęta niejadalne:");
        for (Animal animal : animals) {
            if (!(animal instanceof Edible)) {
                System.out.println(animal);
            }
        }

        List<String> stringList = new LinkedList<>();
        Set<String> stringSet = new TreeSet<>();

        String pn = "poniedzialek";
        String wt = "wtorek";
        String sr = "sroda";
        String czw = "czwartek";

        stringList.add(pn);
        stringList.add(pn);
        stringList.add(pn);
        stringList.add(wt);
        stringList.add(sr);
        stringList.add(pn);

        Collections.sort(stringList);

        System.out.println(stringList);

        stringSet.add(pn);
        stringSet.add(czw);
        stringSet.add(pn);
        stringSet.add(wt);
        stringSet.add(sr);
        stringSet.add(pn);

        System.out.println(stringSet);
/*
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

*/

    }
}