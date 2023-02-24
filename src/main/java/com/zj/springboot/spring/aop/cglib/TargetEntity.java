package com.zj.springboot.spring.aop.cglib;

/**
 * 目标类，也就是要被代理的类
 */

public class TargetEntity {
    public void doSomthing(){
        System.out.println("周二来上班");
    }
    final public void runSomthing(){
        System.out.println("周二打游戏");
    }
}
