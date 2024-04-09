package com.learning.d8_interface;


// 声明一个接口
/*
*  接口 是一种 规范 的体现
* */
public interface Test {

  // 接口的成分特点： 在 JDK 8 之前接口种只能由抽象方法和常量

  // 常量
  public static final String SHCOOL_NAME = "王牌";
  // 抽象方法
  public abstract void run ();
  // 由于是公开的，规范的思想  修饰符 public abstract 可以不写
  void eat();
  String AGE = "12";


}
