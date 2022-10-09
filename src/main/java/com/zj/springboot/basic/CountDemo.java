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
    }
}
