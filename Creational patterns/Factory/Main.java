/*
Define an interface for creating an object, but let subclasses decide which class to instantiate.
Factory method lets a class defer instantiation to subclasses.
*/

package com.company;

public class Main {

    public static void main(String[] args) {

        Factory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        Factory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();

    }
}
