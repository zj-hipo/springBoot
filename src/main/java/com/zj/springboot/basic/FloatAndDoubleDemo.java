package com.zj.springboot.basic;

import com.zj.springboot.log.LogDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;


/**
 * 测试说明为什么不能用浮点型数据表示金额：float（单精度）、double(双精度)
 * 结果：可以看到只有h的精度不变，BigDecimal只有用String形式表示精度才不会丢失，用浮点型当参数也会丢失精度
 */

public class FloatAndDoubleDemo {
    private static Logger logger= LogManager.getLogger(FloatAndDoubleDemo.class);
    public static void main(String[] args) {
        float a=0.1f;
        float b=0;
        double c=0.1d;
        double d=0;

        BigDecimal f=new BigDecimal(0);
        BigDecimal h=new BigDecimal("0");
        for (int i = 0; i <10 ; i++) {
            //禁止使用构造方法BigDecimal(double)的方式把double值转化为BigDecimal对象 说明：
            //反编译出的字节码文件显示每次循环都会new出一个StringBuilder对象，然后进行append操作，
            // 最后通过toString方法返回String对象，造成内存资源浪费。
            //BigDecimal e=new BigDecimal(0.1);
            BigDecimal e=BigDecimal.valueOf(0.1);
            BigDecimal g=new BigDecimal("0.1");
            b+=a;
            d+=c;
            f=f.add(e);
            h=h.add(g);
            logger.info("第"+(i+1)+"个b： "+b);
            logger.info("第"+(i+1)+"个d： "+d);
            logger.info("第"+(i+1)+"个f： "+f);
            logger.info("第"+(i+1)+"个h： "+h);
         /*   System.out.println("第"+(i+1)+"个b： "+b);
            System.out.println("第"+(i+1)+"个d： "+d);
            System.out.println("第"+(i+1)+"个f： "+f);
            System.out.println("第"+(i+1)+"个h： "+h);*/
        }
    }
}
