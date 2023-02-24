package com.zj.springboot.basic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 阿里巴巴面试题
 * 代码块不具有独立执行的能力,那么编译器是如何处理构造代码块的呢?很简单,编译器会把构造代码块插入到每个构造函数的最前端
 * 相当于将构造块代码放到构造函数里执行，就是 System.out.println("构造块");放到构造函数第一行执行
 */

public class BasicDemo {
    public static BasicDemo t1 = new BasicDemo();
    public static BasicDemo t2 = new BasicDemo();
    public static BasicDemo t3= new BasicDemo("有参");
    private static String current="2222";
    //构造块会放到构造函数第一行执行，无参构造，有参构造都会执行；查看编译的class文件
    {
        System.out.println("构造块");
    }
    List<String> list=new ArrayList<>();
    public BasicDemo() {
        System.out.println("构造函数");
    }
    public BasicDemo(String s) {
        System.out.println("有参构造函数");
    }
    //遇到this 构造块不在这里执行
    public BasicDemo(int a) {
        this();
        list.add("a");
        System.out.println("int有参构造函数");
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
