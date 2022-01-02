package com.company;

public class CatFactory extends Factory {

    @Override
    public Cat createAnimal() {
        System.out.println("A new cat is born");

        Cat cat = createInstance();
        cat.eat();

        return cat;
    }

    @Override
    public Cat createInstance() {

        return new Cat();
    }

}
