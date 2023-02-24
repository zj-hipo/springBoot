package com.zj.springboot.desinPattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 *新闻1
 */

public class NewsOne implements News {
    private String title="新闻一";
    //订阅者集合
    private List<Reader> readersList = new ArrayList<Reader>();
    @Override
    public void addReader(Reader observer) {
        if (!readersList.contains(observer)) {
            readersList.add(observer);
        }
    }

    @Override
    public void deleteReader(Reader observer) {
        if (readersList.contains(observer)) {
            readersList.remove(observer);
        }
    }

    @Override
    public void notice(String message) {
        for (Reader reader:readersList) {
            reader.update(title,message);

        }

    }
}
