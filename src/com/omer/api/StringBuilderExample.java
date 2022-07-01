package com.omer.api;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("12");
        b = b.append("3");
        b.reverse();
        System.out.println(b.toString());
    }
}
