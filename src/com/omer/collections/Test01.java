package com.omer.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "3Series",2018,5000L);
        Car car2 = new Car("Mercedes", "CLK",2015,15000L);
        Car car3 = new Car("Audi", "A6",2019,10000L);
        Car car4 = new Car("Ford", "Focus",2013,3000L);
        Car car5 = new Car("Toyota", "Auris",2012,1000L);

        List<Car> list = Arrays.asList(car1,car2,car3,car4,car5);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
