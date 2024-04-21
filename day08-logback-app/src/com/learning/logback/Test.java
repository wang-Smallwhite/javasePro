package com.learning.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* 目标： 快速搭建 LogBack 日志框架，记录程序执行星空到控制台、文件中
*
* */
public class Test {
  public static final Logger LOGGER= LoggerFactory.getLogger("Test.class");
  public static void main(String[] args) {
    while (true) {
      LOGGER.debug("main 开始执行了");
      LOGGER.info("第二行日志开始记录");
      LOGGER.info("第二行日志开始记录");

      int a = 10;
      int b = 0;
      try{
        System.out.println(a/b);
      }catch(Exception e){
        e.printStackTrace();
        LOGGER.error("功能异常" + e);
      }
    }
  }
}
