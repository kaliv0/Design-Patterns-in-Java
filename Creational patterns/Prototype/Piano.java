package com.company;

public class Piano implements Cloneable {

    private String modelName;
    private int numberOfKeys = 64;

    
    public Piano(String name) {
        this.modelName = name;
    }


    public String getModelName() {
        return modelName;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }
  

    public void increaseNumberOfKeys(int number) {
        this.numberOfKeys += number;
    }


    public Piano clone() throws CloneNotSupportedException {

        return (Piano) super.clone();
    }

}
