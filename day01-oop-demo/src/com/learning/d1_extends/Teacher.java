package com.learning.d1_extends;
// 子类老师
public class Teacher extends People{
  private String classify;

  public void printClass() {
    System.out.println(getName() + "负责教学" + getClassify());
  }
  public String getClassify() {
    return classify;
  }

  public void setClassify(String classify) {
    this.classify = classify;
  }
}
