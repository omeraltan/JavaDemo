package com.omer.dates;

import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HandyMethodsExample {
    public static void main(String[] args) {
        //Another reminder 3 days before
        ZonedDateTime totalityAustin = ZonedDateTime.of(2024,4,8,13,35,56,0, ZoneId.of("US/Central"));
        System.out.println("DateTime of 3 day reminder: " + totalityAustin.minus(Period.ofDays(3)));
        //What day of the week is that?
        System.out.println("Day of week for 3 day reminder: " + totalityAustin.minus(Period.ofDays(3)).getDayOfWeek());
        ZonedDateTime localParis = totalityAustin.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        ZonedDateTime localTurkey = totalityAustin.withZoneSameInstant(ZoneId.of("Turkey"));
        System.out.println("Eclipse happens at " + localParis + " Paris time");
        System.out.println("Eclipse happens at " + localTurkey + " Turkey time");
        System.out.println("Phone sister at 2 hours after totality: " + totalityAustin.plusHours(2) + ", " + localParis.plusHours(2) + " Paris time");
        //compare two ZonedDateTimes (must be the same type!)
        System.out.println("Is the 2024 eclipse still in the future? " + ZonedDateTime.now().isBefore(totalityAustin));
        System.out.println("Is 2024 a leap year? " + totalityAustin.toLocalDate().isLeapYear());
        System.out.println("Is 2024 a leap year? " + Year.of(2024).isLeap());

    }
}
