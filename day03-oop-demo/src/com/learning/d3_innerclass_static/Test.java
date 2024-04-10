package com.learning.d3_innerclass_static;

public class Test {
  public static void main(String[] args) {
    // 内部静态类
    OuterStatic.inner ier = new OuterStatic.inner();
    ier.setSchool("school");
    System.out.println(ier.getSchool() + OuterStatic.inner.name);
    ier.run();

    // 内部成员类
    OuterMembers.inner mer = new OuterMembers().new inner();

    // 局部内部类的语法  没有价值，比较鸡肋
    class Cat {
      private String name;

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }
    }
  }
}
