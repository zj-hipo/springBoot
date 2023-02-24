package com.zj.springboot.desinPattern.observer;

/**
 *新闻接口，被订阅者
 */

public interface News {
    //添加订阅者
    void addReader(Reader observer);
    //删除订阅者
    void deleteReader(Reader observer);
    //通知订阅者
    void notice(String message);

}
