package com.omer.api;
import java.util.List;
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
        System.out.println("-------------------------------------");
        Predicate<String> pred5 = (String s) -> true;
        //Predicate<String> pred6 = (Integer s) -> true;
        //Predicate<String> pred7 = (Object s) -> true;
        System.out.println("-------------------------------");
        //Predicate dash = c -> c.startsWith("-");// line doesn't compile
        Predicate<String> dash2 = c -> c.startsWith("-");
        System.out.println(dash2.test("-"));
        System.out.println("-------------------------------");
        Predicate clear = c -> c.equals("clear");
        System.out.println(clear.test("pink"));
        System.out.println("-------------------------------");

    }

    public static void print(List<Integer> list, Predicate<Integer> p){
        for (int num : list)
            if (p.test(num)) {
                System.out.println(num);
            }
    }
}
