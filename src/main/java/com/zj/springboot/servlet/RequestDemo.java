package com.zj.springboot.servlet;

import org.apache.catalina.connector.Request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 通过request对象，我们也可以尝试做些Demo，比如：

 得到浏览器的传递过来的各类信息（请求参数、请求头等）

 实现防盗链

 通过request对象来转发

 解决请求参数中文乱码的问题

 ….
 */

public class RequestDemo extends HttpServlet {
    //HttpServletRequest比ServletRequset多了一些http协议的方法，如getHeader()、getMethod()等
    //Request是在jsp中使用的，其实只是规范中的一个名称而已。它是一个对象，但不是有SUN提供的，这是由各个不同的Servlet提供商编写的，
    // SUN只规定了这个类要实现HttpServletRequest接口，并且规定了各个方法的用途，但具体是什么类什么方法由各个提供商自己决定


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
