package com.omer.api;

import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        //Which of these periods represents a larger amount of time?
        Period period1 = Period.ofWeeks(1).ofDays(3);
        Period period2 = Period.ofDays(10);
        System.out.println(period1);
        System.out.println(period2);
    }
}
