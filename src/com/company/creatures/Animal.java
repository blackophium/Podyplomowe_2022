package com.company.creatures;

import com.company.Saleable;
import com.sun.security.jgss.GSSUtil;

public class Animal implements Feedable, Saleable {
    private static final double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.5;

    public final String species;
    public Double weight;
    public Integer age;
    public String name;
    public Boolean isAlive;

    public Animal(String species){
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species){
            case "felis":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "canis":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
                break;
        }
    }
    public void sale(Human seller, Human  buyer, Double price) throws Exception{
        if(seller.pet != this) {
            throw new Exception("Sprzedawca nie ma zwierzaka");
        }
        if(buyer.cash < price){
            throw new Exception("Nie stać Cię na zwierzaka.");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.pet = this;
        seller.pet = null;
        System.out.println("Sprzedano zwierzaka");
        // zablokowanie
        if (this instanceof Human){
            throw new Exception("Handel ludżmi jest zabroniony!");
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed(){
        if (isAlive){
            weight +=1.0;
            System.out.println("Thx for feed");
        } else {
            System.out.println("Too late");
        }
    }

    public void feed (Double foodWeight){
        if (isAlive){
            weight +=foodWeight;
            System.out.println("Thx for food");
        } else {
            System.out.println("Too late");
        }
    }

    public void takeForAWalk(){
        if (isAlive) {
            weight -= 1.0;
            System.out.println("Thx for a walk");
            if (weight <= 0.0){
                isAlive = false;
            } else {
                System.out.println("Pet is dead");
            }
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
