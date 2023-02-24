package com.zj.springboot.desinPattern;

/**
 * 单例设计模式
 */
public class Singleton {
    private Singleton() {
        System.out.println("创建实例很慢！！！");
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("创建String");
    }

    public static void main(String[] args) {
        Singleton.createString();
    }
}
