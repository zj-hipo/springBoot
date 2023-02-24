package com.zj.springboot.desinPattern.observer;

public class Test {
    public static void main(String[] args) {
        //被订阅者
        News newsOne=new NewsOne();
        News newsTwo=new NewsTwo();
        //订阅者
        Reader readerOne=new NewsReaderOne();
        Reader readerTwo=new NewsReaderTwo();
        Reader readerThree=new NewsReaderThree();
        //增加观察者
        newsOne.addReader(readerOne);
        newsOne.addReader(readerThree);
        newsTwo.addReader(readerTwo);
        newsTwo.addReader(readerThree);
        //新闻内容
        String messageOne="G20峰会召开";
        String messageTwo="俄乌战争打了9个月了";
        newsOne.notice(messageOne);
        newsTwo.notice(messageTwo);
    }
}
