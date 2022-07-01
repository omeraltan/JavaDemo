package com.omer.api;
import java.util.function.Predicate;
public class LambdaExample {
    public static void main(String[] args) {
        Predicate<StringBuilder> p = (StringBuilder b) -> true;
        System.out.println(p.test(new StringBuilder("Ömer ALTAN")));
        System.out.println("-------------------------------------");
        Predicate<String> pred1 = s -> false;
        Predicate<String> pred2 = (s) -> false;
        //Predicate<String> pred3 = String s -> false; // line fail to compile
        Predicate<String> pred4 = (String s) -> false;
    }
}
