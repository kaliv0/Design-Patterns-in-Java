//GoG defitnion => Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException { //You need to add exception to signature

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter model name:");
        String modelName = sc.nextLine();

        System.out.println("Enter number of keys:");
        int numberOfKeys = Integer.parseInt(sc.nextLine());

        System.out.println("Enter color:");
        String color = sc.nextLine();

        System.out.println("Enter price:");
        int price = Integer.parseInt(sc.nextLine());

        Piano piano = new Piano(modelName, numberOfKeys, color, price);
        piano.displayInfo();

        Piano biggerPiano = piano.clone();

        int addAmount;
        System.out.println("Enter amount: "); //selling at a higher price for no particular reason

        addAmount = Integer.parseInt(sc.next());
        biggerPiano.increasePrice(addAmount);

        biggerPiano.displayInfo();
        piano.displayInfo(); //first one hasn't changed


    }
}
