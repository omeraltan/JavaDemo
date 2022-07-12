package com.omer.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaTimeClassesExample {
    public static void main(String[] args) {
        /*  ---java.time Class---               */

        getLocalDateExample();
        getLocalTime();
        getLocalDateTime();
        getZoneDateTime();
        getOffsetDateTime();
        getDateTimeFormatter();
        getInstant();
        getDuration();
        getPeriod();
        getLocale();
    }

    public static void getLocalDateExample(){
        /*  ---Key Instance Creation Options--- */

        LocalDate.now();
        LocalDate.of(2017,8,21);
        LocalDate.parse("2017-08-21");
    }

    public static void getLocalTime(){
        /*  ---Key Instance Creation Options--- */

        LocalTime.now();
        LocalTime.of(10,19,36);
        LocalTime.parse("10:19:36");
    }

    public static void getLocalDateTime(){
        /*  ---Key Instance Creation Options--- */

        LocalDateTime.now();
        LocalDateTime.of(2017,8,21,10,19,36);
        LocalDateTime.parse("2017-08-21T10:19:36");
        LocalDateTime.parse("2017-08-21T10:19:36", DateTimeFormatter.ISO_DATE_TIME);
    }

    public static void getZoneDateTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        /*  ---Key Instance Creation Options--- */

        ZonedDateTime.now();
        ZonedDateTime.of(dateTime ,ZoneId.of("US/Pacific"));
        ZonedDateTime.parse("2017-08-21T10:19:36");
    }

    public static void getOffsetDateTime(){
        /*  ---Key Instance Creation Options--- */

        OffsetDateTime.now();
        OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("-05:00"));
        OffsetDateTime.parse("2017-08-21T10:19:36-05:00");
    }

    public static void getDateTimeFormatter(){
        Locale locTR = new Locale("Turkey");
        /*  ---Key Instance Creation Options--- */

        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(locTR);
    }

    public static void getInstant(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        /*  ---Key Instance Creation Options--- */

        Instant.now();
        zonedDateTime.toInstant();
        localDateTime.toInstant(ZoneOffset.of("+5"));
    }

    public static void getDuration(){
        LocalDateTime localDateTime1 = LocalDateTime.of(1984,8,24,13,34,45);
        LocalDateTime localDateTime2 = LocalDateTime.now();
        /*  ---Key Instance Creation Options--- */

        Duration.between(localDateTime1,localDateTime2);
        Duration.ofMinutes(5);
    }

    public static void getPeriod(){
        LocalDate localDateTime1 = LocalDate.of(1984,8,24);
        LocalDate localDateTime2 = LocalDate.now();
        /*  ---Key Instance Creation Options--- */

        Period.between(localDateTime1,localDateTime2);
        Period.ofDays(3);
    }

    public static void getLocale(){
        /*  ---Key Instance Creation Options--- */

        Locale.getDefault();
        new Locale("it");
        new Locale("tr", "TR");
    }
}
