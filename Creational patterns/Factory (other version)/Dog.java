package com.company;

public class Dog extends Animal{

    @Override
    public void speak() {

        System.out.println("Bow-Wow!");
    }

    public void move(){

        System.out.println("Wags tail");
    }
}
