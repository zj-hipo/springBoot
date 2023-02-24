package com.zj.springboot.spring.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/**
 * 代理类，其实是个拦截器
 * cglib代理，为什么spring不用静态代理和动态代理
 * 方法拦截器
 * 实现MethodInterceptor接口的intercept方法。该方法中参数：
 * obj：表示要进行增强的对象；
 * method：表示要被拦截的方法；
 * objects：表示要被拦截方法的参数；
 * methodProxy：表示要触发父类的方法对象。
 */

//方法拦截器
public class CglibProxy implements MethodInterceptor {
    //obj表示代理对象；method表示目标类中的方法，要拦截的方法；objects表示方法参数；methodProxy表示对方法的代理；
    // invokeSuper方法表示对被代理对象方法的调用
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("对object开始增强:"+method.getName());
        // 注意这里是调用invokeSuper而不是invoke，否则死循环;
        // methodProxy.invokeSuper执行的是原始类的方法;
        // method.invoke执行的是子类的方法;
        Object object=methodProxy.invokeSuper(obj,objects);
        System.out.println("object增强完成:"+method.getName());
        return object;
    }
}
