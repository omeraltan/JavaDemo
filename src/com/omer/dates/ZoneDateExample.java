package com.omer.dates;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZoneDateExample {
    public static void main(String[] args) {
        String eclipseDateTime = "2017-08-21 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        ZonedDateTime zTotalityDateTime = ZonedDateTime.of(eclipseDay, ZoneId.of("US/Pacific"));
        System.out.println("Date and time totality begins with time zone: " + zTotalityDateTime);
        ZonedDateTime zTotalityDateTime2 = ZonedDateTime.of(eclipseDay, ZoneId.of("GMT-7"));
        System.out.println("Date and time totality begins with time zone: " + zTotalityDateTime2);

        /* Only the U.S. Zoneids List */
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        List<String> zoneList = new ArrayList<>(zoneIds);
        Collections.sort(zoneList);
        for (String zoneId: zoneList) {
            if (zoneId.contains("US")){
                System.out.println(zoneId);
            }
        }

        ZoneId pacific = ZoneId.of("US/Pacific");
        ZoneId turkey = ZoneId.of("Turkey");
        // pacific.getRules() returns a ZoneRules object that has all the rules about time zonesi including daylight saving and standart time.
        System.out.println("Is Daylight Savings in effect at time of totality: " + pacific.getRules().isDaylightSavings(zTotalityDateTime.toInstant()));
        System.out.println("Is Daylight Savings in effect at time of totality: " + turkey.getRules().isDaylightSavings(zTotalityDateTime.toInstant()));

        ZonedDateTime followingThursdayDateTime = zTotalityDateTime.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Thursday following the totality: " + followingThursdayDateTime);
    }
}
