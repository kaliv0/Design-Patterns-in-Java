package com.company;

public class MotorCycleBuilder implements Builder {

    private Vehicle motorCycle;
    private String brandName;

    //ctor
    public MotorCycleBuilder(String brandName) {

        this.motorCycle = new Vehicle();
        this.brandName = brandName;
    }


    @Override
    public void startUp() {

        this.motorCycle.add(String.format("MotorCycle model is: %s", this.brandName));
    }

    @Override
    public void buildBody() {

        this.motorCycle.add("Body is constructed");
    }

    @Override
    public void insertWheels() {

        this.motorCycle.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {

        this.motorCycle.add("1 Headlight is added");
    }


    @Override
    public Vehicle getVehicle() {
        return this.motorCycle;
    }
}
