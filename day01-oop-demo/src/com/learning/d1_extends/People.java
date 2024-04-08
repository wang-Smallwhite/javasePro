package com.learning.d1_extends;

//父类

public class People {
  private String name;
  private int age;

  public void queryClass() {
    System.out.println("查看课程");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
