package org.example.Date;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        System.out.println(nowDate.getYear());
        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getDayOfMonth());
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfYear());
        System.out.println("==========================");
        LocalDate date = LocalDate.of(2020, 1, 1);
        System.out.println(date.getMonthValue());
        LocalDate withLocalDate = date.withYear(2021);
        System.out.println(withLocalDate);

    }
}
