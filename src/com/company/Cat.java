package com.company;

public class Cat extends Animal{
    private String breed;

    public Cat(String name, int kol, String breed) {
        super(name, kol);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void print() {
        System.out.println("Name: " + getName() + " Kol: " + getKol()
                + "Breed: " + getBreed());

    }
}
