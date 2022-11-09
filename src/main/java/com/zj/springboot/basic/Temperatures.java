package com.zj.springboot.basic;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 *每日温度
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
 * 其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * 输入: temperatures = [73,74,75,71,69,72,76,73]
 * 输出: [1,1,4,2,1,1,0,0]
 */

public class Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        long begin=System.currentTimeMillis();
        int[] day=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int number=temperatures[i];
            int k=0;
            for(int j=i+1;j<temperatures.length;j++){
                int afterNumber=temperatures[j];
                k++;
                if(number<afterNumber){
                    day[i]=k;
                    break;
                }
            }
        }
        long end=System.currentTimeMillis();
        long total=end-begin;
        System.out.println("暴力解法耗时："+total);
        return day;
    }
    /**
     * Deque是double ended queue的简称，习惯上称之为双端队列
     * pop()方法移除Deque的第一个元素，如果Deque是空则抛异常：
     * peek()返回Deque中的第一个元素并且不擅长，如果Deque是空则返回null：
     */
    public int[] dayTemperatures(int[] temperatures) {
        long begin=System.currentTimeMillis();
        int length = temperatures.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < length; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        long end=System.currentTimeMillis();
        long total=end-begin;
        System.out.println("单调栈解法："+total);
        return ans;
    }


    public static void main(String[] args) {
        int[] temperatures=new int[]{73,74,75,71,69,72,76,73};
        Temperatures tr=new Temperatures();
        int[] dalayResult=tr.dailyTemperatures(temperatures);
        int[] dayResult=tr.dayTemperatures(temperatures);
        System.out.println("暴力解法："+Arrays.toString(dalayResult));
        System.out.println("单调栈解法："+Arrays.toString(dayResult));
    }
}
