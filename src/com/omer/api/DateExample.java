package com.omer.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2016, 12, 25);
        xmas.plusDays(-1);
        System.out.println(xmas.getDayOfMonth());
        System.out.println("-------------------------");
        LocalTime time = LocalTime.MAX;
        System.out.println(time.getNano());
        System.out.println("-------------------------");
        //The code compiles but throws an exception at runtime.
        LocalDate newYears = LocalDate.of(2017,1,1);
        Period period = Period.ofDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");
        System.out.print(format.format(newYears.minus(period)));
    }
}
