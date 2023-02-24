package com.zj.springboot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 *  作用：@Configuration的作用：由普通类型转变为cglib代理类型，后会生成cglib代理对象，通 过代理对象的方法拦截器,
 *  可以解决AppConﬁg内部方法bean之间发生依赖调用的时候从容器中去获取，避免了多例的出现
 *  WebMvcConfigurer：
 */

@Configuration
public class TestInterceptorConfig implements WebMvcConfigurer {
    final  String[] urls={"/**/login","/**/loginTest","/index.html","/view.html"};
    /**
     * 拦截器
     *addInterceptor：需要一个实现HandlerInterceptor接口的拦截器实例(TestInterceptor()实现了拦截器)
     *addPathPatterns：用于设置拦截器的过滤路径规则；addPathPatterns("/**")对所有请求都拦截
     *excludePathPatterns：用于设置不需要拦截的过滤规则
     *拦截器主要用途：进行用户登录状态的拦截，日志的拦截等。
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //可以设置多个拦截器,静态资源可以过滤掉resouces下的resources目录下的html页面不被拦截
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**").excludePathPatterns(urls);
        WebMvcConfigurer.super.addInterceptors(registry);

    }
    /**
     *静态资源
     * addResoureHandler：指的是对外暴露的访问路径
     *addResourceLocations：指的是内部文件放置的目录
     */

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/public/**").addResourceLocations("classpath:/public/");

    }
    /**
     * 页面跳转
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/resources/index.html");

    }
}
