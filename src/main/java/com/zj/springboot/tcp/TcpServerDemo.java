package com.zj.springboot.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo  {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象
        ServerSocket ss = new ServerSocket(8080);

        //监听客户端连接，返回一个对应的Socket对象
        //侦听并接受到此套接字的连接，此方法会阻塞
        Socket s = ss.accept();

        //获取输入流，读取数据
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String (bys,0,len);

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "    ---" +str);

        //释放资源
        s.close();
        //ss.close();

    }
}
