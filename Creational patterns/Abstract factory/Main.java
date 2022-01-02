package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter animal type!");
        System.out.println("Choose between wild and domestic!");

        Scanner sc = new Scanner(System.in);
        String animalType = sc.nextLine();

        System.out.println("Enter specific animal!");

        if (animalType.equals("domestic")) {
            System.out.println("Choose between cat and dog!");

        } else if (animalType.equals("wild")) {
            System.out.println("Choose between lion and wolf!");
        }

        String species = sc.nextLine();

        FactoryCreator creator = new FactoryCreator();

        Factory factory = creator.createFactory(animalType);
        Animal animal = factory.createAnimal(species);

        System.out.println("You created a " + species);
        animal.speak();


    }
}
