package com.zj.springboot.thread;

public class ThreadDemo {
    public void go(){
        Runnable r=new Runnable(){
            public void run(){

                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
    public static void main(String[] args){
        new ThreadDemo().go();
    }
}
