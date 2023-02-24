package com.zj.springboot.controller;

import com.zj.springboot.listener.LoginEvent;
import com.zj.springboot.listener.SpringContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping
public class ListenerController {
    @RequestMapping("/send")
    @ResponseBody
    public void loginSend(){
        LoginEvent loginEvent=new LoginEvent();
        loginEvent.setUserName("1");
        loginEvent.setPassWord("2");
        SpringContextHolder.getApplicationContext().publishEvent(loginEvent);

    }
}
