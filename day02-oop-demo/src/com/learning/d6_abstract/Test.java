package com.learning.d6_abstract;

public class Test {
  /*
  * 抽象 abstract
  *
  * 注意： 🐲
  *   1、类有的东西，抽象类都有
  *   2、抽象中可以没有抽象方法， 但是有抽象方法的必须是抽象类
  *   3、一个类继承了抽象类，必须重写抽象方法，否则这个类也必须成为抽象类
  *   4、不能用 abstract 修饰变量、代码块、构造器
  *  💗 5、抽象类得到了抽象方法，但是失去了创建对象的能力;
  *   为什么不能创建对象， 如果可以创建对象，调用抽象方法的时候，方法体是空的无法进行流程
  *
  *   final 和 abstract 的关系   --------- 互斥关系
  *   final 定义的类不能被继承， abstract 定义的类作为模板需要子类继承
  *   final 定义的方法子类不能重写， abstract 定义的方法子类必须重写
  * */

  public static void main(String[] args) {
//    Animal a = new Animal();
  }
}

// 抽象类
abstract class Animal {
  // 抽象方法的定义  不完整的方法
  public abstract void run();
}

// 子类继承抽象类， 必须重写抽象方法，

class Dog extends Animal {

  @Override
  public void run() {
    System.out.println("子类重写方法");
  }
}

// 如果不想重写方法，必须子类再定义成抽象类
abstract class Cat extends Animal{

}