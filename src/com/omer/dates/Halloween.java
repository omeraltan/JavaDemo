package com.omer.dates;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Halloween {
    public static void main(String[] args) {
        ZonedDateTime d = ZonedDateTime.of(2018,10,31,17,0,0,0, ZoneId.of("Europe/Berlin"));
        Locale locDE = new Locale("de");
        DayOfWeek day = d.getDayOfWeek();
        String df = d.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(locDE));
        System.out.println(day + " " + df);
    }
}
