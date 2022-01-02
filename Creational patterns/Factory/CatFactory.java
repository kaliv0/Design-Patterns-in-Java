package com.company;

public class CatFactory extends Factory {

    @Override
    public Animal createAnimal() {

        System.out.println("New cat is created");

        Animal dog = createInstance();
        return dog;

    }

    @Override
    public Animal createInstance() {
        return new Cat();
    }
}
