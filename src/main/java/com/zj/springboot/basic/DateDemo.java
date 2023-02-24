package com.zj.springboot.basic;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 日期类
 */

public class DateDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        //30天之前的日期
        dateTime=dateTime.minus(30, ChronoUnit.DAYS);
        String  date= DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00").format(dateTime);

        System.out.println(date.toString());

    }
}
