package com.company;

public class HotelWaiter {
    //works faster with static methods
    public static Beverage takeOrder(String beverageType) {
        BeverageBuilder beverageBuilder = getBeverageBuilder(beverageType);
        Beverage newBeverage = null;

        if (beverageBuilder != null) {
            newBeverage = beverageBuilder.buildBeverage();
        }
        return newBeverage;
    }

    private static BeverageBuilder getBeverageBuilder(String beverageType) {
        BeverageBuilder beverageBuilder = null;

        if (beverageType.equalsIgnoreCase("tea")) {
            beverageBuilder = new TeaBuilder();
        } else if (beverageType.equalsIgnoreCase("coffee")) {
            beverageBuilder = new CoffeeBuilder();
        } else {
            System.out.println("Sorry we don't take order for " + beverageType);
        }
        return beverageBuilder;
    }
}
