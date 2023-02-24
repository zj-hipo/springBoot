package com.zj.springboot.listener;


import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *监听器
 */
@Component
public class LoginListener {
    @EventListener
    @Async
    public void loginEvent(LoginEvent loginEvent){
        System.out.println("监听到登录事件："+loginEvent);
    }
}
