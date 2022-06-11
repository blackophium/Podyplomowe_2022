package com.company.creatures;

public class Pet extends Animal{

    public Pet(String species){
        super(species);
    }
    public String toString(){
        return this.species + " " + this.name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
