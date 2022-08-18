package com.zj.springboot.basic;

/**
 * 阿里巴巴面试题
 */

public class BasicDemo {
    public static BasicDemo t1 = new BasicDemo();
    public static BasicDemo t2 = new BasicDemo();
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
