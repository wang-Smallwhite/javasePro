package com.learning.d5_enum;

public class Test {

  /*
  * 枚举是 Java 的以中特俗类型
  * 作用： 为了做信息的标志和信息的分类
  * 格式：
  * 修饰符 enum 枚举名称 {
  *   第一行罗列枚举实例的名称
  * }
  *
  * 特征：
  *   枚举类 都是 继承了枚举类型 java.lang.Enum
  *   枚举都是最终类，不可以被继承
  *   构造器都是私有的，枚举对外不能创建对象
  *   枚举类的第一行默认都罗列枚举对象的名称的
  *   枚举类相当于是多例模式
  * */

  public static void main(String[] args) {
    Season spring = Season.SPRING;
    System.out.println(spring);
  }
}

enum Season {
  SPRING,SUMMER,AUTUMN,WINTER;
}

