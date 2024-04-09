package com.learning.d3_final;

public class Test2 {
  /*
  *  final 修饰变量，有且只能被赋值一次
  *
  * 变量有几种
  * 1、局部变量
  * 2、成员变量
  *     -- 实例成员变量
  *     -- 静态成员变量
  * */
  public static void main(String[] args) {
    final double rate = 3.14;
//  rate = 3.15;  // 第二次赋值会报错

    buy(0.8);

//    name = "123";

    Test2 t = new Test2();
    // t.age = "13";
  }

  public static void buy(final double z) {
    // z = 23.13;  // 第二次赋值了
  }

  // 修饰静态成员变量
  public static final String name = "wang";

  // 修饰实例成员变量
  private final String age = "13";
}
