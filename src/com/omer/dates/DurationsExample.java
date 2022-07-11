package com.omer.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationsExample {
    public static void main(String[] args) {
        //Eclipse begins in Austin, TX
        LocalTime begins = LocalTime.of(12,17,32);
        //Totality in Austin, TX
        LocalTime totality = LocalTime.of(13,35,56);
        System.out.println("Eclipse begins at " + begins + " and totality is at " + totality);
        //How many minutes between when the eclipse begins and totality?
        long betweenMins = ChronoUnit.MINUTES.between(begins,totality);
        System.out.println("Minutes between begin and totality: " + betweenMins);

        Duration betweenDuration = Duration.ofMinutes(betweenMins);
        System.out.println("Duration: " + betweenDuration);
        //PT means "period of time" meaning Duration (rather than Period)

        LocalTime totalityBegins = begins.plus(betweenDuration);
        System.out.println("Totality begins, computed: " + totalityBegins);
    }
}
