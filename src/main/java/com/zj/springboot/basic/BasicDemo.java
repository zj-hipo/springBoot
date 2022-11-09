package com.zj.springboot.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 阿里巴巴面试题
 */

public class BasicDemo {
    public static BasicDemo t1 = new BasicDemo();
    public static BasicDemo t2 = new BasicDemo();
    private static String current="";
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }
    public static void main(String[] args)
    {
        BasicDemo t = new BasicDemo();

    }
}
