package com.zj.springboot.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {
    private static Logger logger= LogManager.getLogger(LogDemo.class);
    public static void testLog(){
        logger.info("参数");
    }

    public static void main(String[] args) {
        LogDemo.testLog();
        try{
            logger.info("正确的");
            int a=10/0;
        }catch (Exception e){
            e.printStackTrace();
            logger.info("出错啦"+e.getMessage());
            logger.error("error");
        }
    }
}
