package org.example.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)-1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(d);
        System.out.println(year + "年" + month + "月" + day + "日" + getWeek(week) + hour + " 时" + minute + "分" + second + "秒");
    }

    public static String getWeek(int week)
    {
        return switch (week) {
            case 1 -> "星期日";
            case 2 -> "星期一";
            case 3 -> "星期二";
            case 4 -> "星期三";
            case 5 -> "星期四";
            case 6 -> "星期五";
            case 7 -> "星期六";
            default -> "输入错误";
        };
    }
}
