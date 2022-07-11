package com.omer.dates;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample2 {
    public static void main(String[] args) {
        //Totality begins in Austin, TX in 2024 at 1:35pm and 56 seconds;
        ZonedDateTime totalityAustin = ZonedDateTime.of(2024,4,8,13,35,56,0, ZoneId.of("US/Central"));
        System.out.println("Next total eclipse in the US, date/time in Austin, TX: " + totalityAustin);
        //Reminder for a month before
        Period period = Period.ofMonths(1);
        System.out.println("Period is " + period);
        ZonedDateTime reminder = totalityAustin.minus(period);
        System.out.println("DateTime of 1 month reminder: " + reminder);
        //Reminder for Mandras, Oregon:
        System.out.println("Zoned DateTime (Mandras, OR) of reminder: " + reminder.withZoneSameInstant(ZoneId.of("US/Pacific")));

    }
}
