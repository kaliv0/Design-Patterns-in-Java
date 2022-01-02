package com.company;

public class WildFactory extends Factory {

    @Override
    public Animal createAnimal(String animalType) {
        Animal animal = null;

        if (animalType.equals("lion")) {
            animal = new Lion();

        } else if (animalType.equals("wolf")) {
            animal = new Wolf();
        }

        return animal;
    }
}
