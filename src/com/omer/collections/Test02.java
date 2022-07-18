package com.omer.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  CarSortByYear implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

class  CarSortByPrice implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

public class Test02 {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("BMW", "3Series",2018,5000L);
        Vehicle car2 = new Vehicle("Mercedes", "CLK",2015,15000L);
        Vehicle car3 = new Vehicle("Audi", "A6",2019,10000L);
        Vehicle car4 = new Vehicle("Ford", "Focus",2013,3000L);
        Vehicle car5 = new Vehicle("Toyota", "Auris",2012,1000L);

        List<Vehicle> list = Arrays.asList(car1,car2,car3,car4,car5);

        Collections.sort(list, new CarSortByYear());
        list.forEach(System.out::println);
    }

}
