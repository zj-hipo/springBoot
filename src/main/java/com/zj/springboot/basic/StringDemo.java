package com.zj.springboot.basic;

public class StringDemo {
    public static void main(String[] args) {
        String s1="123";
        String s2="123";
        String s3=s1;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        //结果全为true，是因为在堆上作了缓存，字符串池;new的话全为false
        String s4=new String("123");
        String s5=new String("123");
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        System.out.println(s5==s4);
        //给包含双引号的字符串再加一个双引号并转义
        String s6="\"wwww\"";
        System.out.println("转义前："+s6);
        StringBuffer buffer=new StringBuffer();
        buffer.append("\"");
        String s7="";
        if (s6.contains("\"")){
            s7=s6.replace("\"","\\\"");
        }
        buffer.append(s7);
        buffer.append("\"");
        System.out.println("加双引号并转义："+buffer);


        //分割字符串
        //正则表达式中\s匹配任何空白字符，包括空格、制表符、换页符等等, 等价于[ \f\n\r\t\v]
        //而“\s+”则表示匹配任意多个上面的字符。另因为反斜杠在Java里是转义字符，所以在Java里，我们要这么用“\\s+”.
        String blank="abb cdd \"ef f\" ghh jkk \"lo  o\" pee";
        //String[] arr=blank.split("\\s\"");
        String[] arr=blank.split("\"");
        for (int i = 0; i <arr.length ; i++) {
            String result=arr[i];
            
            System.out.println("字符："+arr[i]);

        }


    }
}
