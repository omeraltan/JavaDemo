package com.omer.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        String eclipseDateTime = "2017-08-21 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        System.out.println("Eclipse day: " + eclipseDay);
        //Of course, you can also use DateTimeFormatter to change the format of the output:
        System.out.println("Eclipse day, formatted: " + eclipseDay.format(DateTimeFormatter.ofPattern("dd, mm, yy hh, mm")));
        System.out.println("Mom time: " + eclipseDay.plusHours(2));
        System.out.println("Going home: " + eclipseDay.plusDays(3));
        System.out.println("What day of the week is eclipse? " + eclipseDay.getDayOfWeek());
    }
}
