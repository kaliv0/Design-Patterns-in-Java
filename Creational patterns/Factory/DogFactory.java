package com.company;

public class DogFactory extends Factory {

    @Override
    public Animal createAnimal() {

        System.out.println("New dog is created");

        Animal dog = createInstance();
        return dog;
    }

    @Override
    public Animal createInstance() {

        return new Dog();
    }
}
