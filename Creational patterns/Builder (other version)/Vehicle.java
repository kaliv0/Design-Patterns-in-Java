package com.company;

import java.util.*;

public class Vehicle {

    private List<String> parts;

    //ctor
    public Vehicle() {

        this.parts = new ArrayList<String>();
    }


    //methods
    public void add(String part) {

        this.parts.add(part);
    }


    public void displayInfo() {

        System.out.println("\nVehicle completed as below: ");

        for (String part : parts) {
            System.out.println(part);
        }
    }


}
