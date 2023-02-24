package com.zj.springboot.controller;


import org.apache.tomcat.util.net.IPv6Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class ConfigController {
    /**
     * 可以登录templates目录下的login.html页面
     */
    @RequestMapping("/loginTest")
    public String testLogin(){
        return "login.html";
    }
    /**
     * 被拦截器拦截，登录不了login.html页面
     */
    @RequestMapping("/loginTest1")
    public String testLogin1(){
        return "login.html";
    }
}
