/*
Separate the construction of a complex object from its representation so that the same 
construction processes can create different representations

Builder pattern builds complex object using a step by step approach
*/

package com.company;

public class Main {

    public static void main(String[] args) {

        Beverage tea = HotelWaiter.takeOrder("tea");
        System.out.println(tea);

        Beverage coffee = HotelWaiter.takeOrder("coffee");
        System.out.println(coffee);

        Beverage water = HotelWaiter.takeOrder("water");
        //toString method will display "null"
    }
}

