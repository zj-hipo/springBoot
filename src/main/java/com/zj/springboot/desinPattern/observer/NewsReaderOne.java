package com.zj.springboot.desinPattern.observer;


/**
 * 订阅者1
 */

public class NewsReaderOne implements Reader {
    private String readerName="订阅者1";

    @Override
    public void update(String title, String message) {
        System.out.println(readerName+": 新闻时报【"+title+"】:"+message);
    }
}
