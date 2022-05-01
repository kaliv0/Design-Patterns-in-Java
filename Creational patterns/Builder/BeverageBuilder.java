package com.company;

public abstract class BeverageBuilder {

    private final Beverage beverage;

    public BeverageBuilder() {
        this.beverage = new Beverage();
    }

    public Beverage getBeverage() {

        return this.beverage;
    }

    //template method that creates beverage object, adds components and returns it
    public final Beverage buildBeverage() {
        setBeverageType();
        setWaterQty();
        setMilkQty();
        setSugarQty();
        setPowderQty();

        return this.beverage;
    }

    //methods for setting beverage ingredients
    abstract void setBeverageType();

    abstract void setWaterQty();

    abstract void setMilkQty();

    abstract void setSugarQty();

    abstract void setPowderQty();
}
