package com.zj.springboot.basic;


/**
 * static的用法
 */
public class StaticDemo {
    private String desc;
    private  int height;
    //初始化加载
    static {
        String desc="测试";
        System.out.println(desc);
    }
    public String grantValue(String desc){
        return desc;
    }

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();
        String fall=staticDemo.grantValue("FallOut");
        System.out.println(fall);
    }
}
