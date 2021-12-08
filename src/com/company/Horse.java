package com.company;

public class Horse extends Animal{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Horse(String name, int kol, int speed) {
        super(name, kol);
        this.speed = speed;
    }
    public void print() {
        System.out.println("Name: " + getName() + " Kol: " + getKol()
                + "Speed: " + getSpeed());

    }
}
