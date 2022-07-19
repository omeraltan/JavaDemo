package com.omer.collections;


import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new java.util.TreeMap<>();
        Map<Integer, String> map2 = new java.util.TreeMap<>();

        map2.put(600, null);
        map2.put(200, "value2");
        map2.put(200, "value3");
        map2.put(100,"value1");
        map2.put(400, "value4");
        map2.put(500, "value5");

        System.out.println(map2);

        for (Integer key : map2.keySet()) {
            System.out.println("key : " + key + " , value : " + map2.get(key));
        }

    }
}
