/*
Strategy pattern (also known as Policy pattern) enables selecting an algorithm at runtime.
Instead of implementing a single algorithm directly,
code receives run-time instructions as to which in a family of algorithms to use.
*/

import java.math.BigDecimal;

import models.*;

public class Client {

    public static void main(String[] args) {
        var smallerPrice = new BigDecimal("80");
        var biggerPrice = new BigDecimal("100");

        var calculator = new DiscountCalculator();

        System.out.println("Computing discount for price under $100:");
        var discount = calculator.computeDiscount("Christmas", smallerPrice);
        System.out.printf("%.2f\n", discount);

        System.out.println("Computing Christmas discount for price equal to $100:");
        discount = calculator.computeDiscount("Christmas", biggerPrice);
        System.out.printf("%.2f\n", discount);

        System.out.println("Computing Easter discount:");
        discount = calculator.computeDiscount("Easter", biggerPrice);
        System.out.printf("%.2f\n", discount);

        System.out.println("Computing again discount for price under $100:");
        discount = calculator.computeDiscount("Christmas", smallerPrice);
        System.out.printf("%.2f\n", discount);

        System.out.println("Computing New Year discount:");
        discount = calculator.computeDiscount("New Year", biggerPrice);
        System.out.printf("%.2f\n", discount);

        System.out.println("Computing Hanukkah discount:");
        discount = calculator.computeDiscount("Hanukkah", biggerPrice);
        System.out.printf("%.2f\n", discount);
    }
}
