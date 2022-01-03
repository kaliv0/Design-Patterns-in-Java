package com.company;

public interface Builder {

    void startUpOperations();

    void buildBody();
    void insertWheels();
    void addHeadlights();

    void endOperations();

    //retrieves the constructed object
    Vehicle getVehicle();
}
