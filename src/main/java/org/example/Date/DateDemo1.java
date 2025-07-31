package org.example.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(0L);
        System.out.println(date2);
        date2.setTime(365*24*60*60*1000L);
        System.out.println(date2);

        long l1 = date1.getTime();
        System.out.println(l1);
        long l2 = date2.getTime();
        System.out.println(l2);
        SimpleDateFormat df = new SimpleDateFormat();
        System.out.println(df.format(date1));

        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df1.format(date1));

        SimpleDateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        System.out.println(df2.format(date1));

        String str = "2020-01-01 01:01:01";
        SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3 = df3.parse(str);
        System.out.println(date3);
    }
}
