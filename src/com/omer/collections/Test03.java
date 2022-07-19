package com.omer.collections;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<>();

        map2.put(100,"value1");
        map2.put(200, "value2");
        map2.put(200, "value3");
        map2.put(400, "value4");
        map2.put(500, "value5");
        map2.put(600, null);

        System.out.println(map2);

        for (Integer key : map2.keySet()) {
            System.out.println("key : " + key + " , value : " + map2.get(key));
        }

    }

}
