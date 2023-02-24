package com.zj.springboot.thread;

public class ThreadPoolDemo {
    //TODO 模拟使用线程池，不同的队列会不会造成栈内存溢出
    //线程池使用队列作为进行通信的队列对象，如果没有指定队列大小，在不断向线程池加入消息过程中，
    // 线程池消费速度跟不上生产速度，队列中就会不断积压消息，导致进程内存不断增加；
}
