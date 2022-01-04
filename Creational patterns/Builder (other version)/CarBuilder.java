package com.company;

public class CarBuilder implements Builder {

    private Vehicle car;
    private String brandName;


    public CarBuilder(String brandName) {
        this.car = new Vehicle();
        this.brandName = brandName;
    }


    @Override
    public void startUp() {

        this.car.add(String.format("Car model is: %s", this.brandName));
    }

    @Override
    public void buildBody() {

        this.car.add("Body is constructed");
    }

    @Override
    public void insertWheels() {

        this.car.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {

        this.car.add("2 Headlights are added");
    }

    @Override
    public Vehicle getVehicle() {

        return this.car;
    }
}
