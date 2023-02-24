package com.zj.springboot.aop.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *代理的类不能为final，否则报错【在内存中构建子类来做扩展，当然不能为final，有final就不能继承了】
 *目标对象的方法如果为final/static, 那么就不会被拦截，即不会执行目标对象额外的业务方法。
 */

public class FactoryProxy implements MethodInterceptor {
    // 维护目标对象
    private Object target;
    public FactoryProxy(Object target){
        this.target = target;
    }

    // 给目标对象创建代理对象
    public Object getProxyInstance(){
        //1. 工具类
        Enhancer en = new Enhancer();
        //2. 设置父类
        en.setSuperclass(target.getClass());
        //3. 设置回调函数
        en.setCallback(this);
        //4. 创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务.....");

        // 执行目标对象的方法
        Object returnValue = method.invoke(target, objects);

        System.out.println("提交事务.....");

        return returnValue;
    }
}
