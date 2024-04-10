package com.learning.d3_innerclass_static;

public class OuterStatic {
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  /*
 * 内部静态类
 * */
  public static class inner {
    public static String name = "静态内部类";
    private String school;
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
//     System.out.println(age); // 报错  不能直接访问
     System.out.println("我是内部类方法");
   }
 }
}
