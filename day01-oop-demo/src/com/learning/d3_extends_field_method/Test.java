package com.learning.d3_extends_field_method;

public class Test {
  public static void main(String[] args) {
    // 继承后的成员的访问特点： 就近原则
    Dog d = new Dog();
    d.run();
    d.showName();
  }
}


class Animal {
  public String name = "动物名";
  public void run() {
    System.out.println("动物需奔跑");
  }
}

class Dog extends Animal {
  public String name = "狗名";

  public void showName() {
    String name = "局部名";
    System.out.println(name);
    System.out.println(this.name);  // 获取
    System.out.println(super.name);  // 获取父类 super
  }

  // 方法重写， 子类出现了和父类一样的方法
  public void run() {
    System.out.println("狗子需要奔跑");
  }
}
