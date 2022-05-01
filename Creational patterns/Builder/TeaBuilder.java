package com.company;

public class TeaBuilder extends  BeverageBuilder{
    @Override
    void setBeverageType() {
        System.out.println("Tea");
        getBeverage().setBeverageName("Tea");
    }

    @Override
    void setWaterQty() {
        System.out.println("Step 1: Boiling water");
        getBeverage().setWaterQty(40);
    }

    @Override
    void setMilkQty() {
        System.out.println("Step 2: Adding milk");
        getBeverage().setMilkQty(50);
    }

    @Override
    void setSugarQty() {
        System.out.println("Step 3: Adding sugar");
        getBeverage().setSugarQty(10);
    }

    @Override
    void setPowderQty() {
        System.out.println("Step 4 : Adding 9 Grams of tea powder");
        getBeverage().setPowderQty(9);
    }
}
