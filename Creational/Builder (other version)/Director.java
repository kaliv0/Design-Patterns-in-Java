//controls building process

package com.company;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct(Builder builder) {

        this.builder = builder;

        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
        
    }
}
