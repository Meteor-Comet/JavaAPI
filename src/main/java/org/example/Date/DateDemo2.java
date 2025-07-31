package org.example.Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateDemo2 {
    public static void main(String[] args) {
        Set<String> zoneIDs = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIDs);
        System.out.println(zoneIDs.size());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);

        //Instant 时间戳
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        Instant instant3 = Instant.ofEpochSecond(1000000000L);
        Instant instant4 = Instant.ofEpochSecond(10000L);
        System.out.println(instant3.isAfter(instant4));

        Instant instant5 = instant4.minusSeconds(1);
        System.out.println(instant5);
    }
}
