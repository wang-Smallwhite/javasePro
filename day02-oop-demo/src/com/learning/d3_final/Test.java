package com.learning.d3_final;

public class Test {
  /*
  * final 语法
  * 1. final 修饰类， 不能被继承
  * 2. final 修饰方法，不能被重写
  * 3. final 修饰变量，有且只能被赋值一次
  *
  *
  * 🎆 final 修饰引用类型的变量，其地址值不能改变，但是指向的对象的内容可以改变
  * */


  class People{
    public final void run() {
      System.out.println("run");
    }
  }
  class Student extends People {

    // 父类中的方法被final 修饰，则子类不能重写
//    @Override
//    public void run() {
//      super.run();
//
//    }
  }

//  class Wolf extends Animal {}
// final 无法被继承  使用场景 工具类 添加final
//  final class Animal{}
}
