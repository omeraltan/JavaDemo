package com.omer.api;

import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {
        Predicate<StringBuilder> p = (StringBuilder b) -> true;
        System.out.println(p.test(new StringBuilder("Ömer ALTAN")));
    }
}
