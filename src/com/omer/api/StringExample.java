package com.omer.api;

public class StringExample {
    public static void main(String[] args) {
        String b = "12";
        b += "3";
        b.replace("1", "5");// String is immutable :)
        System.out.println(b); // output: 123
    }
}
