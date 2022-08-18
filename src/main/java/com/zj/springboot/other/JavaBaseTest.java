package com.zj.springboot.other;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaBaseTest {
    Logger logger= LoggerFactory.getLogger(JavaBaseTest.class);
    /**
     * 错误判断奇偶的方式
     * @param i
     * @return
     */
    public static boolean isOdd1(int i){

        return i%2==1;
    }

    /**
     * 正确判断奇偶得方式
     * @param i
     * @return
     */
    public static boolean isOdd2(int i){
        return i%2!=0;
    }

    /**
     * Double的精度
     * @param d
     */
    public static void doubleTest(Double d) {
        //它打印出来的是0.899999999999
        System.out.println(2.00 - 1.10);
    }

    /**
     * char和String的区别
     * @param
     */
    public  static void charTest(){
        String letters="ABC";
        char[] numbers={'1','2','3'};
        System.out.println(numbers);//输出123
        System.out.println(letters+"as"+numbers);//输出ABCas[C@dd8dc3
    }
    public static void main(String[] args) {
       JavaBaseTest.charTest();

    }
}
