package com.learning.d1_package;

// 导包
// import com.learning.d1_package.it.Student;

import com.learning.d1_package.it2.Student;

public class Test {
  public static void main(String[] args) {
//    Student s = new Student();
    Student s = new Student();

    // 如果不同包下有相同的类名需要包名全称
    com.learning.d1_package.it.Student st = new com.learning.d1_package.it.Student();
  }
}
