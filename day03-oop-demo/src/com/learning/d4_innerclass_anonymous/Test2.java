package com.learning.d4_innerclass_anonymous;

public class Test2 {
  public static void main(String[] args) {
    // 现在使用匿名内部类
    Swimming s = new Swimming() {
      @Override
      public void swim() {
        System.out.println("学生游泳");
      }
    };
    go(s);

    // 匿名类可以作为方法的形参传输
    go(new Swimming() {
      @Override
      public void swim() {
        System.out.println("老师游泳");
      }
    });

    // 😡 匿名内部类简化代码
    gogo(new Fu() {
      @Override
      public void run() {
        System.out.println("跑起来");
      }
    });
  }

  public static void go(Swimming s) {
    s.swim();
  }

  public static void gogo(Fu n) {
    n.run();
  }
}


abstract class Fu {
  public abstract void run();
}


//通常情况下  接口不能直接定义对象，需要实现类
class Student implements Swimming {

  @Override
  public void swim() {
    System.out.println("学生游泳");
  }
}


interface Swimming {
  void swim();
}