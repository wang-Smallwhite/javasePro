package com.learning.d4_innerclass_anonymous;

public class Test {
  /*
  * 匿名内部类
  *
  * */
  public static void main(String[] args) {
    Animal a = new Animal() {
      @Override
      public void run() {
        System.out.println("run");
      }
      public void read() {
        System.out.println("read");
      }
    };

    a.run();
//    a.read();  // 报错
  }
}


class  Tiger extends Animal {

  @Override
  public void run() {

  }
}

abstract class Animal {
  public abstract void run();

}