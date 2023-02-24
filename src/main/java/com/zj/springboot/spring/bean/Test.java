package com.zj.springboot.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    private BeanDemo beanDemo;
    public void testBean(){
        beanDemo.print();
    }

    public static void main(String[] args) {
        Test test1=new Test();
        test1.testBean();
    }
}
