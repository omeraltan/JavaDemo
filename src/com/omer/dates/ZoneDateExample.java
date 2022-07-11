package com.omer.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateExample {
    public static void main(String[] args) {
        String eclipseDateTime = "2017-08-21 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        ZonedDateTime zTotalityDateTime = ZonedDateTime.of(eclipseDay, ZoneId.of("US/Pacific"));
        System.out.println("Date and time totality begins with time zone: " + zTotalityDateTime);
    }
}
