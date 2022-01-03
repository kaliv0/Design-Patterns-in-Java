package com.company;

import java.math.BigDecimal;

public class Piano implements Cloneable {

    private String modelName;
    private int numberOfKeys;
    private String color;
    private int price;   //could be BigDecimal

    //constructor
    public Piano(String name, int number, String color, int price) {
        this.modelName = name;
        this.numberOfKeys = number;
        this.color = color;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }


    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public void increasePrice(int newAmount) {

        if (newAmount > 0) {
            this.price += newAmount;

        } else {

            System.out.println("Added price amount should be positive number.%n");
        }
    }

    public void displayInfo() {

        System.out.printf("Your %s has %d keys, %s color and costs %d dollars.%n",
                this.getModelName(), this.getNumberOfKeys(), this.getColor(), this.getPrice());
    }


    public Piano clone() throws CloneNotSupportedException {

        return (Piano) super.clone(); //in this case creates a shallow copy
    }

}
