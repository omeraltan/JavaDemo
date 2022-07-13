package com.omer.dates;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class GmtExample {
    public static void main(String[] args) {
        /*If it is 19:12:53 on October 27, 2017, in the US/Pacific Zone (which is GMT-8:00, summer time), then what does the following code fragment produce?*/
        ZoneId zid = ZoneId.of("US/Eastern");
        Instant i = Instant.now();
        ZonedDateTime zdt = i.atZone(zid);
        System.out.println(zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    }
}
