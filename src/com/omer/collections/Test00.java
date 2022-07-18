package com.omer.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test00 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,5,2,100,-10,-20,1,7);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
