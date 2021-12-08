package com.company;

public class Main {

    public static void main(String[] args) {
        /*createObjects("Cat").print();
        createObjects("Dog").print();
        createObjects("Horse").print();*/
        Printable[] animal = {createObjects("Cat"),createObjects("Dog"), createObjects("Horse")};
        for (Printable printable : animal) {
            printable.print();

        }


    }
    public static Printable createObjects(String Animal ){
        Printable printable = null;
        switch (Animal){
            case "Cat":
                printable  = new Cat("Barsik", 3,"Siamskii");
                break;
            case "Dog":
                printable = new Dog("SHarik", 2, "Black");
                break;
            case "Horse":
                printable = new Horse("Gylsaru", 6,60);
                break;


        }
        return printable;
    }
}
