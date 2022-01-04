/*
Separate the construction of a complex object from its representation so that the same
construction processes can create different representations

Builder pattern builds complex object using a step-by-step approach
*/

package com.company;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder("Honda");
        Vehicle car = director.construct(carBuilder);
        car.displayInfo();

        MotorCycleBuilder motorCycleBuilder = new MotorCycleBuilder("Yamaha");
        Vehicle motorCycle = director.construct(motorCycleBuilder);
        motorCycle.displayInfo();


    }
}
