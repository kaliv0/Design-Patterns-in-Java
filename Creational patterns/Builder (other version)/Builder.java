package com.company;

public interface Builder {

    void startUp();

    void buildBody();

    void insertWheels();

    void addHeadlights();

    //retrieves the constructed object
    Vehicle getVehicle();
}
