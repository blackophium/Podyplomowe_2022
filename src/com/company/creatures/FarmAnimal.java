package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public String toString(){
        return this.species + " " + this.getWeight();
    }

    @Override
    public void beEaten(){
        this.isAlive = false;
        this.weight= 0.0;
        System.out.println("Zjedzone!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }

    // @Override
   // public void feed(Double foodWeight) {

    //}

    //@Override
    //public void sell(Human seller, Human buyer, Double price) throws Exception {

    //}
}
