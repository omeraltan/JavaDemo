package com.omer.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {

        Locale myLocale = Locale.getDefault();
        System.out.println("My locale: " + myLocale);
        LocalDateTime aDateTime = LocalDateTime.of(2024,4,8,13,35,56);
        System.out.println("The date and time: " + aDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        ZonedDateTime zDateTime = ZonedDateTime.of(aDateTime, ZoneId.of("US/Pacific"));

        Locale locIT = new Locale("it");                // Italy
        Locale locPT = new Locale("pt");                // Portugal
        Locale locBR = new Locale("pt", "BR");  // Brazil
        Locale locIN = new Locale("hi", "IN");  // India
        Locale locJA = new Locale("ja");                // Japan
        Locale locDK = new Locale("da", "DK");  // Denmark

        System.out.println("Italy (Long) " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.ITALY)));
        System.out.println("Italy (Short) " + aDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(locIT)));
        System.out.println("Japan (Long) " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.JAPAN)));
        System.out.println("Portugal (Long) " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(locPT)));
        System.out.println("India (Long) " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(locIN)));
        System.out.println("Denmark (Medium) " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(locDK)));

    }
}
