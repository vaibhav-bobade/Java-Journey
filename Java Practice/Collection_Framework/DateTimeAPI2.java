package Collection_Framework;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;

public class DateTimeAPI2 {
    public static void main(String[] args) {

        // Current date-time in Paris
        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(parisTime); //2026-06-22T13:11:28.799+02:00[Europe/Paris]

        // Convert Paris time to India time
        ZonedDateTime indiaTime = parisTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println(indiaTime); //2026-06-22T16:41:28.799+05:30[Asia/Kolkata]

        Instant instant = Instant.now();
        System.out.println(instant); //2026-06-22T11:14:22.183Z

        LocalDate today = LocalDate.now();
        System.out.println(today); //2026-06-22
        // Adding and Subtracting
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println(nextWeek); //2026-06-29

        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday); //2026-06-21

        // Chaining modifications
        LocalDate futureDate = today.plusYears(1).minusMonths(2).plusDays(5);
        System.out.println(futureDate); //2027-04-27
    }
}