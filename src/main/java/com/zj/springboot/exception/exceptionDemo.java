package com.zj.springboot.exception;

public class exceptionDemo {
    public static void main(String[] args) {
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            //使用了throw，就是明确的要抛出一个异常，而不是捕获。但是这是main方法，所以确实是把抛出的RuntimeException抛给了调用者（JVM）
            //加上下面这段，程序会抛异常
            //throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }
}
