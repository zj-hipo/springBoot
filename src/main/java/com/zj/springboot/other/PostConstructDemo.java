package com.zj.springboot.other;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
/**
 *  @PostConstruct注解在@component、@Service下才起作用，main方法里创建对象不起作用
 *  spring默认是单例模式；单例：启动spring容器，便会创建对象；多例：启动容器不会创建对象，获得bean的时候才会创建对象。
 */


@Component
//@Scope("prototype")
public class PostConstructDemo {
    public PostConstructDemo() {
        System.out.println("=========Spring容器加载PostConstructDemo类==========");
    }

    @PostConstruct
    public void init(){
        System.out.println("=========随类加载==================");
    }
    public void doDemo(){
        System.out.println("普通方法");
    }
    public static void main(String[] args) {
        PostConstructDemo postConstructDemo=new PostConstructDemo();
        postConstructDemo.doDemo();
    }
}
