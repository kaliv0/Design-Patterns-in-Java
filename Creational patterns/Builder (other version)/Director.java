//controls building process

package com.company;

public class Director {

    private Builder builder;


    public Vehicle construct(Builder builder) {

        this.builder = builder;

        builder.startUp();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();

        return builder.getVehicle();

    }
}
