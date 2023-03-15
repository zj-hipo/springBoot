package com.zj.springboot.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator迭代器
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> demoList = new ArrayList<>();
        demoList.add("周一");
        demoList.add("周二");
        demoList.add("周三");
        demoList.add("周四");
        demoList.add("周五");
        //获取迭代器
        Iterator<String> iterable = demoList.iterator();
        //循环输出集合的元素
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }
        //获取第一个元素,注意如果while遍历了所有的元素，这时候再使用next()遍历，就会报错（遍历完之后，就没有next了，指针指向了空）
       /* String firstElement=iterable.next();
        System.out.println("List中第一个元素:"+firstElement);*/
       //此处falg为false，代表集合里没有元素了(其实是指针指向了空，元素还存在，重新创建一个迭代器，还是能获取元素的)
        Boolean flag = iterable.hasNext();
        System.out.println(false);

    }
}
