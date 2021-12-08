package com.company;

public class Animal implements Printable {
    private String name;
    private int kol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public Animal(String name, int kol) {
        this.name = name;
        this.kol = kol;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " Kol: " + getKol());

    }
}
