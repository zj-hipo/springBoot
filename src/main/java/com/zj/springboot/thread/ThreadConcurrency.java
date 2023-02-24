package com.zj.springboot.thread;

public class ThreadConcurrency implements  Runnable{
    private int i=0;
    public void run(){
        int num=1500;
        for (int j = 0; j <num ; j++) {
            i=i+1;
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
    public void test(){
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadConcurrency threadConcurrency=new ThreadConcurrency();
        Thread thread1=new Thread(threadConcurrency,"线程1");
        Thread thread2=new Thread(threadConcurrency,"线程2");
        thread1.start();
        thread2.start();
        Thread.sleep(10000);
        threadConcurrency.test();

    }
}
