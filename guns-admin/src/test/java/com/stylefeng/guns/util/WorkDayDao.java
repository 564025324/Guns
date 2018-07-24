package com.stylefeng.guns.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WorkDayDao {
    public static Date addWorkday(Date startDate, int workDays) {
        // String dateString =
        return null;
    }

    /**
     * 计算输入字符串日期的 t-1 个自然日
     *
     * @param dateStr
     * @return t-1日（String）
     */
    public static String t_1day(String dateStr) {
        Date t_1d = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date calday = sdf.parse(dateStr);
            System.out.println("传递日期: " + dateStr);
            t_1d = (Date) calday.clone();
            t_1d.setDate(calday.getDate() - 1);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return sdf.format(t_1d);
    }

    /**
     * 计算开始日到结束日之间自然日天数
     *
     * @param arg1        开始日
     * @param arg2        结束日
     * @param datePattern 开始/结束日期样式
     * @return 天数
     */
    public static long daysBetween2Day(String arg1, String arg2, String datePattern) {
        long diff = 0;
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        Calendar day1 = Calendar.getInstance();
        ;
        Calendar day2 = Calendar.getInstance();
        ;

        try {
            day1.setTime(sdf.parse(arg1));
            day2.setTime(sdf.parse(arg2));

            diff = (day2.getTimeInMillis() - day1.getTimeInMillis()) / (60 * 60 * 24 * 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return diff;
    }

    public static void main(String[] args) {
        // System.out.println("T-1日： " +t_1day("2018-08-01"));
        System.out.println("日期间隔：" + daysBetween2Day("20180723", "20180823", "yyyyMMdd"));
    }


}
