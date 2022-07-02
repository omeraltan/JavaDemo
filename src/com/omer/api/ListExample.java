package com.omer.api;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(chars.size() + " " + chars.contains('b'));
        System.out.println("-------------------------------");
        String[] array = {"Natural History", "Science"};
        List<String> museum = Arrays.asList(array);
        museum.set(0, "Art");
        System.out.println(museum.contains("Art"));
        System.out.println("-------------------------------");
        List<Character> charExample = new ArrayList<>();
        charExample.add('a');
        charExample.add('b');
        charExample.set(1,'c');
        charExample.remove(0);
        System.out.print(charExample.size());
        System.out.println("-------------------------------");
        List<Integer> pennies = new ArrayList<>();
        pennies.add(3);
        pennies.add(2);
        pennies.add(1);
        pennies.remove(2);
        System.out.println(pennies);
        System.out.println("-------------------------------");
        List<String> magazines = new ArrayList<>();
        magazines.add("Readers Digest");
        magazines.add("People");
        magazines.clear();
        magazines.add("The Economist");
        magazines.remove(1);
        System.out.println(magazines.size());
     }
}
