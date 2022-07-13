package com.omer.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample3 {
    public static void main(String[] args) {
        ZonedDateTime nowzdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("US/Pacific"));
        System.out.println("America Pacific now: " + nowzdt);
        ZonedDateTime berlinZdt = ZonedDateTime.from(nowzdt);
        System.out.println("Europe Berlin now: " + berlinZdt);
        ZonedDateTime berlinZdt2 = nowzdt.withZoneSameInstant(ZoneId.of("Europe/Berlin"));
        System.out.println("Europe Berlin now: " + berlinZdt2);
        ZonedDateTime berlinZdt3 = ZonedDateTime.ofInstant(nowzdt.toInstant(),ZoneId.of("Europe/Berlin"));
        System.out.println("Europe Berlin now: " + berlinZdt3);
        System.out.println("--------------------------------");
        ZonedDateTime totalityUTC = ZonedDateTime.of(LocalDateTime.of(2019,7,2,16,55),ZoneId.of("Z"));
        System.out.println("South America Eclipse Day: " + totalityUTC);
        ZonedDateTime totalitySanJuan = totalityUTC.withZoneSameInstant(ZoneId.of("America/Argentina/San_Juan"));
        System.out.println("Argentina/San_Juan Eclipse Day: " + totalitySanJuan);
    }
}
