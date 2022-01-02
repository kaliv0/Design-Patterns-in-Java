package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter animal type!");
        System.out.println("Choose between cat, dog, lion, wolf");

        Scanner sc = new Scanner(System.in);
        String animalType = sc.nextLine();

        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.createAnimal(animalType);

        animal.speak();
    }
}
