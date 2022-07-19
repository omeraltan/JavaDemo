package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        List<Integer> genericList = new ArrayList<>();
        genericList.add(10);
        genericList.add(20);
        genericList.add(30);
        genericList.add(40);

        addElement(genericList);

        System.out.println(genericList);
    }

    public static void addElement(List nonGeneric){
        nonGeneric.add("legal or illegal?");
    }
}
