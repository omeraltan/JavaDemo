package com.omer.singleton;

public class ImmutableTest {
    public static void main(String[] args) {
        ImmutableMutant mutant = new ImmutableMutant("Omer", 12, 23);
        System.out.println(mutant.getName());
        System.out.println(mutant.getNumberOfArms());
        System.out.println(mutant.getNumberOfLegs());
    }
}
