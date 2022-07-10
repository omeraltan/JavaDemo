package com.omer.singleton;

public class ImmutableMutant {
    private final String name;
    private final int numberOfArms;
    private final int numberOfLegs;

    public ImmutableMutant(String name, int numberOfArms, int numberOfLegs) {
        this.name = name;
        this.numberOfArms = numberOfArms;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfArms(){
        return numberOfArms;
    }

    public int getNumberOfLegs(){
        return numberOfLegs;
    }
}
