package com.learning.d1_extends;



public class Test {
  public static void main(String[] args) {
    People p = new People();
    Student s = new Student();
    s.setName("孙悟空");
    s.setAge(500);
    System.out.println(s.getName());
    System.out.println(s.getAge());
    s.queryClass();
    s.run();
    System.out.println("父类" + p.getName());
    Teacher t = new Teacher();
    t.setName("菩提祖师");
    t.setClassify("七十二变");
    t.printClass();
  }
}
