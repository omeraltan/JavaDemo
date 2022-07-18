package com.omer.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(-10);
        hashSet.add(-20);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(100);
        hashSet.add(50);

        hashSet.forEach(System.out::println);

        System.out.println("---------------");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(-10);
        linkedHashSet.add(-20);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        linkedHashSet.add(100);
        linkedHashSet.add(50);

        linkedHashSet.forEach(System.out::println);
    }
}
