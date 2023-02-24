package com.zj.springboot.spring.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * 测试类
 */
public class CglibTest {
    public static void main(String[] args) {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer=new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(TargetEntity.class);
        //设置回调函数
        enhancer.setCallback(new CglibProxy());
        //这里的creat方法就是正式创建代理类
        TargetEntity targetEntityProxy=(TargetEntity)enhancer.create();
        //拦截此方法
        targetEntityProxy.doSomthing();
        //目标对象的方法如果为final/static, 那么就不会被拦截
        targetEntityProxy.runSomthing();
    }
}
