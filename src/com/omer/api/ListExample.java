package com.omer.api;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List frisbees = new ArrayList();

        List<String> tools = new ArrayList<>();
        tools.add("hammer");
        tools.add("nail");
        tools.add("hex key");
        System.out.println(tools.get(1));
        System.out.println("-------------------------------");
        List<String> museums = new ArrayList<>(1);
        museums.add("Natural History");
        museums.add("Science");
        museums.add("Art");
        museums.remove(2);
        System.out.println(museums);
        System.out.println("-------------------------------");
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.set(1, 'c');
        chars.remove(0);
        System.out.print(chars.size() + " " + chars.contains('b'));
     }
}
