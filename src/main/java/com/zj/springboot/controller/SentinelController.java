package com.zj.springboot.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ThreadLocalRandom;
/**
 *阿里巴巴sentinel熔断器
 */

@Controller
@RequestMapping("sentinel")
public class SentinelController {
    @RequestMapping("simple")
    @ResponseBody
    public String simpleTest(){
        try{
            Thread.sleep(ThreadLocalRandom.current().nextInt(40,60));
        }catch (Exception e){
            System.out.println("异常");
        }
        return "===simpleTest===";
    }
    /**
     * sentinel控制台，熔断器案例
     */
    @RequestMapping("/{simple1}")
    @ResponseBody
    public String simpleTest1(@PathVariable String simple1, HttpServletRequest request) throws Exception{
        Entry entry=null;
        String s="";
        try{
            entry= SphU.entry(simple1);
            Thread.sleep(ThreadLocalRandom.current().nextInt(40,60));
        }catch (BlockException e){
            System.out.println("异常");
            s="请求异常";
        }finally {
            if (entry!=null){
                entry.exit();
            }
        }
        return s+"===simpleTest1==="+simple1;
    }

}
