package com.zj.springboot.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpDemo {
    public static void main(String[] args) throws IOException{
        //创建发送端的Socket对象
        Socket socket=new Socket("127.0.0.1",8080);
        //Socket对象可以获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("socket测试".getBytes());
        socket.close();
    }
}
