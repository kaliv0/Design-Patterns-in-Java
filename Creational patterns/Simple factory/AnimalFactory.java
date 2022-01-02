package com.company;

public class AnimalFactory {

    public Animal createAnimal(String animalType) {

        Animal newAnimal = null;

        if (animalType.equals("dog")) {
            newAnimal = new Dog();

        } else if (animalType.equals("cat")) {
            newAnimal = new Cat();

        } else if (animalType.equals("lion")) {
            newAnimal = new Lion();

        } else if (animalType.equals("wolf")) {
            newAnimal = new Wolf();

        }

        return newAnimal;
    }
}
