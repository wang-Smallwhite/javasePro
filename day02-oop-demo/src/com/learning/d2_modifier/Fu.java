package com.learning.d2_modifier;

public class Fu {
//  定义私有成员： private 只能本类中访问
  private void privateMehtod() {
    System.out.println("-------private-------");
  }

  // 定义缺省修饰成员： 只能本类中、 同包下其他类访问（包访问权限）
  void method() {
    System.out.println("--------method-------");
  }

  // protected 修饰方法：本类，同包的其他类中，其他包的子类中 可以访问
  protected void protectedMethod() {
    System.out.println("---------------protected----------------");
  }

  // public 修饰方法： 本类，同包的其他类中，其他包的子类，其他包的无关类
  public void publicMethod() {
    System.out.println("-------------public--------------");
  }

  public static void main(String[] args) {
    Fu f = new Fu();
    f.privateMehtod();
    f.protectedMethod();
    f.publicMethod();
    f.method();
  }
}
