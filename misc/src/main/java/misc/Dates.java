package misc;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
//        oldStyle();
//        java8local();
//        java8zoned();
//        java8chrono();
//        period();
//        duration();
//        temporalAdjusters();
        backwardCompatibility();
    }

    private static void backwardCompatibility() {
        Date dateTime = new Date();
//        dateTime.setYear(2016);
//        dateTime.setHours(03);
//        dateTime.setSeconds(55);
        System.out.println(dateTime);
        Instant instant = dateTime.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/London"));
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Warsaw"));
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);
    }

    private static void temporalAdjusters() {
        LocalDate date = LocalDate.now();
        LocalDate nextTuesday = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextTuesday);
        LocalDate secondSaturday = date
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(secondSaturday);
    }

    private static void period() {
        LocalDate from = LocalDate.now();
        LocalDate to = from
                .plus(3, ChronoUnit.DAYS)
                .plus(4, ChronoUnit.YEARS)
                .plus(2, ChronoUnit.DECADES);
        Period period = Period.between(from, to);
        System.out.println(period);

        LocalDate transformedDate = from.plus(period);
        System.out.println(transformedDate);
    }

    private static void duration() {
        LocalTime from = LocalTime.now();
        LocalTime to = from
                .plus(8, ChronoUnit.HOURS)
                .plus(10, ChronoUnit.MINUTES)
                .plus(12, ChronoUnit.SECONDS);
        Duration duration = Duration.between(from, to);
        System.out.println(duration);
    }

    private static void java8chrono() {
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        LocalDate transformedDate = today
//                .plus(2, ChronoUnit.DAYS)
//                .plus(3, ChronoUnit.MONTHS)
//                .plus(4, ChronoUnit.DECADES);
//        System.out.println(transformedDate);


        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime transformedDateTime = dateTime
                .plus(1, ChronoUnit.DECADES);
//                .plus(2, ChronoUnit.YEARS);
//                .plus(3, ChronoUnit.MONTHS);
//                .plus(4, ChronoUnit.WEEKS);
//                .plus(5, ChronoUnit.DAYS);
//                .plus(6, ChronoUnit.HOURS);
//                .plus(7, ChronoUnit.MINUTES);
//                .plus(8, ChronoUnit.SECONDS);
//                .plus(9, ChronoUnit.MILLIS);
//                .plus(10, ChronoUnit.MICROS)
//                .plus(11, ChronoUnit.NANOS);
        System.out.println(transformedDateTime);
    }

    private static void java8zoned() {
        ZonedDateTime currentZonedTime = ZonedDateTime.now();
        System.out.println("Current zoned datetime: " + currentZonedTime);

        ZoneId zoneId = ZoneId.systemDefault();
//        ZoneId zoneId = ZoneId.of("Europe/Warsaw");
//        ZoneId zoneId = currentZonedTime.getZone();
        System.out.println(zoneId);
    }

    private static void java8local() {
//        LocalDateTime currentLocalTime = LocalDateTime.now();
//        System.out.println("Current local datetime: " + currentLocalTime);

//        System.out.println("year: " + currentLocalTime.getYear());
//        System.out.println("month: " + currentLocalTime.getMonth());
//        System.out.println("day of month: " + currentLocalTime.getDayOfMonth());
//        System.out.println("hour: " + currentLocalTime.getHour());
//        System.out.println("minute: " + currentLocalTime.getMinute());
//        System.out.println("second: " + currentLocalTime.getSecond());
//        System.out.println("day of week: " + currentLocalTime.getDayOfWeek());
//        System.out.println("day of year: " + currentLocalTime.getDayOfYear());

//        System.out.println(currentLocalTime.withDayOfMonth(14).withYear(2000));

//        System.out.println(LocalDateTime.of(2020, Month.DECEMBER, 11, 13, 14, 15, 123000000));
//        System.out.println(LocalDate.of(1987, 02, 04));
//        System.out.println(LocalDate.of(1987, Month.FEBRUARY, 04));

//        System.out.println(LocalTime.of(17, 12, 22));

//        System.out.println(LocalTime.parse("20:15-30"));
//        System.out.println(LocalDate.parse("2011-03-04").withYear(2004));
//        System.out.println(LocalDateTime.parse("2011-03-04T12:13:14").withNano(300000000));
    }

    private static void oldStyle() {
        Date date = new Date(2016, 03, 30, 12, 02);
        System.out.println(date);
    }
}
