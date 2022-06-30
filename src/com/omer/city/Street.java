package com.omer.city;

public class Street {
    public static void dancing() throws RuntimeException {
        try {
            throw new IllegalArgumentException();
        } catch (Error e) {
            System.out.print("Unable!");
        }
    }
    //command + option + L = Format Document
    public static void main(String... count) throws RuntimeException {
        dancing();
    }
}
