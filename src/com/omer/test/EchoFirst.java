package com.omer.test;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class EchoFirst {
    public static void main(String[] args) {
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}
