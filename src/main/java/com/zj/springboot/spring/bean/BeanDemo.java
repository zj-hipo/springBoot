package com.zj.springboot.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * bean的几种作用域
 */
//@Scope("singleton")
//@Scope("prototype")
public class BeanDemo {
    public void print(){
        System.out.println("singleton");
    }

}
