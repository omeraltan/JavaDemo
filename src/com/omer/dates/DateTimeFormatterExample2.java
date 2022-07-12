package com.omer.dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterExample2 {
    public static void main(String[] args) {
        ZonedDateTime totalityAustin = ZonedDateTime.of(2024,8,30,13,30,56,0, ZoneId.of("US/Central"));
        System.out.println("Totality date/time written for sister in Europe: " + totalityAustin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
        System.out.println("Totality date/time in UK Locale: " + totalityAustin.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.UK)));
    }
}
