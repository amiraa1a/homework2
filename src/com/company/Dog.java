package com.company;

public class Dog extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, int kol, String color) {
        super(name, kol);
        this.color = color;
    }
    public void print() {
        System.out.println("Name: " + getName() + " Kol: " + getKol()
        + "Color: " + getColor());

    }
}
