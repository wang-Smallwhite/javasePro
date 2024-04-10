package com.learning.d3_innerclass_static;

public class OuterMembers {
/*
* 内部成员类
* 不加static修饰， 属于外部类的对象
* */
private int age;
private String name = "外部类name";

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public class inner {
    private String school;
    private String name = "内部类name";
    public inner() {

    }
    public inner(String school) {
      this.school = school;
    }

    public String getSchool() {
      return school;
    }

    public void setSchool(String school) {
      this.school = school;
    }

    public void run() {
      String name = "25";
     System.out.println(age); // 可以直接访问外部类的 成员变量
      System.out.println("我是内部类方法");

      System.out.println(name);  // 25
      System.out.println(this.name); // 内部类name
      System.out.println(OuterMembers.this.name);  // 外部类name

      // 😡 成员内部类中访问所在外部类对象，格式： 外部类名.this
    }
  }
}
