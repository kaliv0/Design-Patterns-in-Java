package com.company;

public class Cat extends Animal{

    @Override
    public void speak() {

        System.out.println("Meow!");
    }

    public void eat() {

        System.out.println("Eats milk");
    }
}
