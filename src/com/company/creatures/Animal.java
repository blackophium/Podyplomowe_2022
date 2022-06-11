package com.company.creatures;

import com.company.Saleable;

public abstract class Animal implements Feedable, Saleable {
    private static final double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.5;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;

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

        // zablokowanie handlu ludzmi
        if(this instanceof Human){
            throw new Exception("Handel ludźmi jest zabroniony!");
        }

        buyer.cash -= price;
        seller.cash += price;
        buyer.pet = this;
        seller.pet = null;
        System.out.println("Sprzedano zwierzaka");
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodweight){
        if (isAlive){
            weight += foodweight;
            System.out.println("Thx for feed");
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

public abstract String toString();
  //  @Override
  //  public void sell(Human seller, Human buyer, Double price) throws Exception {

}

