package com.zj.springboot.arithmetic;

import java.util.Arrays;

/**
 *冒泡排序
 * 比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
 * 这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第
 *N-1 个位置。
 * 冒泡排序在双层循环中实现，其中外层循环控制排序轮数，总循环次数为要排序数组的长度减 1。
 * 而内层循环主要用于对比相邻元素的大小，以确定是否交换位置，对比和交换次数依排序轮数而减少。
 */

public class BubbleSort {
    public static  void bubbleSorting(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            System.out.println(i+"@@@@@@@"+(array.length-1));
            for (int j = 0; j <array.length-1-i ; j++) {
                System.out.println(array[j]+"对比"+array[j+1]);
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array=new int[]{7,4,8,5,19,13,88,99,66,1,8};
        BubbleSort.bubbleSorting(array);
    }
}
