package com.omer.dates;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class AdjustmentOptions {

    static LocalDate localDate;
    static LocalTime localTime;
    static LocalDateTime localDateTime;
    static ZonedDateTime zonedDateTime;

    public static void main(String[] args) {
        /* Adjustment Options for java.time Class */
        /* Adjustment Options and Examples (all methods create a new datetime object) */
        getLocalDate();
        getLocalTime();
        getLocalDateTime();
        getZoneDateTime();
    }

    public static void getLocalDate(){
        localDate.minusDays(3);
        localDate.plusWeeks(1);
        localDate.withYear(2018);
    }

    public static void getLocalTime(){
        localTime.minus(3, ChronoUnit.MINUTES);
        localTime.plusMinutes(3);
        localTime.withHour(12);
    }

    public static void getLocalDateTime(){
        localDateTime.minusDays(3);
        localDateTime.plusMinutes(10);
        localDateTime.plus(Duration.ofMinutes(3));
        localDateTime.withMonth(2);
    }

    public static void getZoneDateTime(){
        zonedDateTime.withZoneSameInstant(ZoneId.of("US/Pacific"));
    }

}
