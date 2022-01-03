package com.company;

public class Main {

    public static void main(String[] args) {

        Captain captain1 = Captain.getCaptain();

        Captain captain2 = Captain.getCaptain();

        if (captain1 == captain2) {

            System.out.println("captain1 and captain2 are same instance");
        }

    }
}
