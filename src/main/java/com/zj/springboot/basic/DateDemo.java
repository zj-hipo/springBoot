package com.zj.springboot.basic;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期类
 */

public class DateDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        //30天之前的日期
        dateTime=dateTime.minus(30, ChronoUnit.DAYS);
        String  date= DateTimeFormatter.ofPattern("yyyyMM").format(dateTime);
        System.out.println(dateTime);
        System.out.println(date);
        Calendar calendar=new GregorianCalendar();
        calendar.add(Calendar.DATE,-30);
        Date date2=calendar.getTime();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate1=simpleDateFormat.format(date2).substring(0,10);
        calendar.add(Calendar.DATE,1);
        date2=calendar.getTime();
        String currentDate2=simpleDateFormat.format(date2).substring(0,10);
        System.out.println(currentDate1);
        System.out.println(currentDate2);


    }
}
