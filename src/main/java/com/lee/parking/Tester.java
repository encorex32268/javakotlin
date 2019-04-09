package com.lee.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {

        //java8Date
//        java8Date();
//        javaDate();

        LocalDateTime enter = LocalDateTime.of(
                2019,4,9,13,00
        );
        LocalDateTime leave = LocalDateTime.of(
                2019,4,9,15,30
        );

        Car car = new Car("AA-00999",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);
    }

    private static void java8Date() {
        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String pattern = "yyyy/MM/dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2045,12,31,22,00,00,22);
        System.out.println(other);
    }

    private static void javaDate() {
        Date date = new Date();
        System.out.println(date);
        String datePattern = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(datePattern);
        System.out.println(simpleDateFormat.format(date));

        String dateString = simpleDateFormat.format(date);
        Date other = null ;
        try {
            other = simpleDateFormat.parse(dateString);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
