package com.omer.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantsExample {
    public static void main(String[] args) {
        ZonedDateTime totalityAustin = ZonedDateTime.of(2024,4,8,13,35,56,0, ZoneId.of("US/Central"));
        Instant totalityInstant = totalityAustin.toInstant();
        //Even though we created a ZonedDateTime for Austin at 1:35 PM, in the US/Central time zone, the instant displays as 6:35 PM and shows a Z at the end.
        //That datetime represents 6:35 PM GMT. The Z is how you know the time displayed is for the GMT zone, rather than the U.S. Central zone. This format is the ISO_INSTANT format of displaying a datetime.
        System.out.println("Austin's eclipse instant is: " + totalityInstant);

        Instant nowInstant = Instant.now(); // represents now
        Instant totalityInstant2 =  totalityAustin.toInstant(); // same as above
        long minsBetween = ChronoUnit.MINUTES.between(nowInstant,totalityInstant2);
        Duration durationBetweenInstants = Duration.ofMinutes(minsBetween);
        System.out.println("Minutes between " + minsBetween + ", is duration " + durationBetweenInstants);
    }
}
