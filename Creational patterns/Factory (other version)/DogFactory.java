package com.company;

public class DogFactory extends Factory {

    @Override
    public Dog createAnimal() {

        System.out.println("A new dog is born");

        Dog dog = createInstance();
        dog.move();

        return dog;
    }

    @Override
    public Dog createInstance() {

        return new Dog();
    }
}
