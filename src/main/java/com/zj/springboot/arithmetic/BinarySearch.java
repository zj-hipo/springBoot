package com.zj.springboot.arithmetic;


/**
 * 二分查找
 */

public class BinarySearch {
    public static int biSearch(int[] array, int a) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right-left) / 2;//中间位置,计算 mid 时需要防止溢出
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) { //向右查找
                left = mid + 1;
            } else if(array[mid] > a){ //向左查找
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //有序的数组
        int[] number=new int[]{1,3,6,8,11,17,29,36,38,45,66,123,129,138,164};
        int[] number2=new int[]{1,3,3,3,11,17,29,36,38,45,66,123,129,138,164};
        BinarySearch binarySearch=new BinarySearch();
        int resultNumber=binarySearch.biSearch(number,66);
        int resultNumber2=binarySearch.biSearch(number2,66);
        System.out.println(number[resultNumber-1]);
        System.out.println(number[resultNumber2-1]);
    }
}
