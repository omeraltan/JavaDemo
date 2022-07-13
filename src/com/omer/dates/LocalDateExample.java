package com.omer.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2018,1,1);
        LocalDate d2 = LocalDate.of(2018,6,15);
        Period r = Period.between(d1,d2);
        System.out.println("Months and days: " + r.getMonths() + ", " + r.getDays());
    }
}
