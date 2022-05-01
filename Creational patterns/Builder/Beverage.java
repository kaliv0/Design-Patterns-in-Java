package com.company;

public class Beverage {
    private int waterQty;
    private int milkQty;
    private int sugarQty;
    private int powderQty;
    private String beverageName;

    public int getWaterQty() {
        return waterQty;
    }

    public void setWaterQty(int waterQty) {
        this.waterQty = waterQty;
    }

    public int getMilkQty() {
        return milkQty;
    }

    public void setMilkQty(int milkQty) {
        this.milkQty = milkQty;
    }

    public int getSugarQty() {
        return sugarQty;
    }

    public void setSugarQty(int sugarQty) {
        this.sugarQty = sugarQty;
    }

    public int getPowderQty() {
        return powderQty;
    }

    public void setPowderQty(int powderQty) {
        this.powderQty = powderQty;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    @Override
    public String toString() {
        return "Hot " + beverageName + "!!!!  ["
                + waterQty + " ml of water, " + milkQty + "ml of milk, "
                + sugarQty + " gm of sugar, " + powderQty
                + " gm of " + beverageName + "]\n";
    }
}

