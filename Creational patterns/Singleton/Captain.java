package com.company;

public final class Captain {

    private static Captain captain;

    private Captain() {
    }
    

    public static synchronized Captain getCaptain() {

        if (captain == null) {

            captain = new Captain();
            System.out.println("New captain is elected for your team");

        } else {

            System.out.println("Your team already has a captain");
        }

        return captain;
    }
}
