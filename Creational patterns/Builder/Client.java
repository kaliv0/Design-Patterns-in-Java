/*
Separate the construction of a complex object from its representation so that the same 
construction processes can create different representations

Builder pattern builds complex object using a step by step approach
*/
package com.company;

public class Client {

    public static void main(String[] args) {
        Beverage tea = HotelWaiter.takeOrder("tea");
        System.out.println(tea);

        Beverage coffee = HotelWaiter.takeOrder("coffee");
        System.out.println(coffee);

        HotelWaiter.takeOrder("water");
        //takeOrder method will return "null"
    }
}

