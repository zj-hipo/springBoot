package com.zj.springboot.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 字节输入流
 */

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\demo.txt");
        FileInputStream fs = new FileInputStream(file);
        int hasRead = 0;
        byte[] bytes = new byte[1024];
        //read()返回的是单个字节数据（字节数据可以直接专程int类型)，但是read(bytes)返回的是读取到的字节数，真正的数据保存在buf中
        //read(bytes),从输入流中读取b.length个字节到字节数组中，返回读入缓冲区的总字节数，若到达文件末尾，则返回-1
        while ((hasRead = fs.read(bytes)) > 0) {
            //每次最多将1024个字节转换成字符串，这里tmp2.txt中的字符小于1024，所以一次就读完了
            //循环次数 = 文件字符数 除以 buf长度
            //将字节转为字符
            System.out.println(new String(bytes, 0, hasRead));
        }
        fs.close();
    }
}

