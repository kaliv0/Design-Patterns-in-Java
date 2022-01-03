package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException { //You need to add exception to signature

        Piano piano = new Piano("Yamaha");
        System.out.printf("Your %s has %s keys%n", piano.getModelName(), piano.getNumberOfKeys());

        Piano biggerPiano = piano.clone();
        biggerPiano.increaseNumberOfKeys(24);
        System.out.printf("Your %s has %s keys%n", biggerPiano.getModelName(), biggerPiano.getNumberOfKeys());


    }
}
