package com.zj.springboot.basic;

public class CountDemo {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        for (int i = 0; i < 10; i++) {
            int b=0;
            b++;
            a+=b;
            System.out.println(b+":"+i);
            c++;
        }

        System.out.println("a: "+a);
        System.out.println("c: "+c);
        //10转为2进制为1010，左移两位在后面加俩00 变为101000,101000转为十进制为40
        int r=10<<2;
        System.out.println("r左移两位等于="+r);
        int n=-10<<2;
        System.out.println("n左移两位等于="+n);
        //右移n位就相当于除以2的n次方 取商，10/4=2.5 取2
        int m=10>>2;
        System.out.println("m右移两位等于="+m);
    }
}
