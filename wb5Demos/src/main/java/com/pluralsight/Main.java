package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Asset a = new Asset();
        House h = new House();
        Animal pet1 = new Animal();
        pet1.setName("Fred");
        pet1.setSpecies("Goldfish");
        pet1.eat(0.25f);

        h.setValue(100000);
        a.setValue(15);
        Dog pet2 = new Dog();
        pet2.setName("Spot");
        pet2.setBreed("Labrador");

        Cat pet3 = new Cat();
        pet3.setName("Buttons");

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println(pet2.getBreed());
        pet3.meow();
        pet2.bark();
        pet2.eat(55);
        pet2.bark();
    }
}