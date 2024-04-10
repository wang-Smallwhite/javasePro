package com.learning.d1_polymorphic;

import org.w3c.dom.ls.LSOutput;

public class Test {
  // 多态的形式
  // 多态的前提： 有继承/实现关系；有父类引用指向子类对象；有方法重写


  public static void main(String[] args) {
    // 父类 名称 = new 子类构造器（）；
//    自动类型转换
    Animal d = new Dog();
    Animal t = new Tortoise();
    // 接口 对象名称 = new 实现类构造器
    Fu f = new Child();

    /*
     * 特点：
     *   方法调用： 编译看左边，运行看右边
     *   变量调用： 编译看左边，运行也看左边
     * */
    System.out.println(d.name);  // 输出 父类的 name
    d.run();  // 运行子类的方法


    /*
     * 优势： 多态形势下，右边对象可以实现解耦合，便于扩展维护
     *       定义方法的时候，使用父类型作为参数， 该方法可以接受这父类的一切子类对象
     * */
    go(d);
    go(t);

    /*
    劣势
      堕胎下不能使用子类的独有功能
    */
//    d.lookDoor();   // 不能调用子类的特有方法


    /*
    * 自动类型转换： 子类对象赋值给父类类型的变量指向
    * 强制类型转换：
    *   子类 对象变量 = （子类）父类类型变量
    *   作用： 可以解决多态下的劣势，可以实现调用子类的独有功能
    *   注意： 如果 转型后的类型 和对象的真实类型不是同一种类型， 那么在转换的时候会出现 ClassCastException
    * */
    Dog dog = (Dog) d;
    dog.lookDoor();
    // 注意 都会报错
//    Tortoise tot = (Tortoise) d;
//    Dog dg = (Tortoise) t;

    // instanceof 来判断 类型是否一致 再进行强制转换
    if(d instanceof Dog) {
      // 判断 对象 d 是否是 Dog 类
    }else if(t instanceof Tortoise) {
      // 判断 对象 t 是否 是 Tortoise 类
    }
  }

  public static void go(Animal a) {
    a.run();
  }
}


class Animal {
  public String name = "animal";
  public void run() {
    System.out.println("跑");
  }
}

class Dog extends Animal {
  public String name = "dog";
  @Override
  public void run() {
    System.out.println("🐕跑");
  }

  public void lookDoor() {
    System.out.println("🐕在看门");
  }
}


class Tortoise extends Animal {
  @Override
  public void run() {
    System.out.println("🐢跑");
  }
}

interface Fu {
  void run();
}

class Child implements Fu {

  @Override
  public void run() {
    System.out.println("interface跑");
  }
}