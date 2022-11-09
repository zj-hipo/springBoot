package com.zj.springboot.basic;


import org.slf4j.Logger;

/**
 *for循环
 * for循环中，如果遇见了break语句，这个for循环就会立即终止，不在进行其他的迭代了。
 * 遇见continue语句，for会立即终止执行后面的语句，然后进入下一次迭代了。
 */

public class ForDemo {
    public static void breakDemo(){
        for (int i = 0; i <20 ; i++) {
            System.out.println("单循环break测试："+i);
            if (i == 5) {
                break;
            }
        }
        for (int i = 1; i <10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("双循环break测试："+j*i);
                if (j == 5) {
                    break;
                }

            }

        }
    }
    public static void continueDemo(){
        for (int i = 0; i <20 ; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println("单循环continue测试："+i);
        }
        for (int i = 1; i <5; i++) {
            for (int j = 1; j < 6; j++) {

                if (j == 5) {
                    continue;
                }
                System.out.println("双循环continue测试："+j*i);
            }

        }

    }

    public static void main(String[] args) {
        ForDemo.continueDemo();
    }
}
