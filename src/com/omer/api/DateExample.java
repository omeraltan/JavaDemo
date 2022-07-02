package com.omer.api;

import java.time.LocalDate;

public class DateExample {
    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2016, 12, 25);
        xmas.plusDays(-1);
        System.out.println(xmas.getDayOfMonth());
    }
}
