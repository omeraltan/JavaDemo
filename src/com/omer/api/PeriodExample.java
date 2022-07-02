package com.omer.api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodExample {
    public static void main(String[] args) {
        //Which of these periods represents a larger amount of time?
        Period period1 = Period.ofWeeks(1).ofDays(3);
        Period period2 = Period.ofDays(10);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println("----------------------");
        LocalDate newYears = LocalDate.of(2017, 1, 1);
        Period period = Period.ofDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.print(format.format(newYears.minus(period)));
        System.out.println("----------------------");
    }
}
