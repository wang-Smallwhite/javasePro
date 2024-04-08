package com.learning.d2_extends_feature;
/*
 * 特点
 * 子类可以继承父类的属性和行为，但是子类不能继承子类构造器
 * JAVA是单继承模式： 一个类只能继承一个父类
 * java 不支持多继承，但是支持多层继承
 * java 所有的类都是Object类 的子类
 *
 * */
public class Test {
  public static void main(String[] args) {
    Tiger t = new Tiger();
    // * 子类可以继承父类的私有属性，只是不可以访问
    // t.eat();

    // * 子类是否可以继承父类的静态成员， 不算继承，只是共享
    System.out.println(t.location);
  }
}

class Animal {
  private void eat() {
    System.out.println("eateat");
  }
  public static String location = "动物园";
}

class Tiger extends Animal {}