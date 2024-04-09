package com.learning.d2_modifier.itcast;

import com.learning.d2_modifier.Fu;

public class Test {

  public static void main(String[] args) {
    Fu f = new Fu();
    f.publicMethod();
//    f.method(); // 缺省定义的方法 其他包下无法访问
//    f.protectedMethod();  // 保护方法 其他包下无关类无法访问
//    f.privateMethod();  // 私有方法无法访问
  }
}

class Test1 extends Fu {
  public static void main(String[] args) {
    Test1 Zi = new Test1();
    Zi.publicMethod();
    Zi.protectedMethod(); // 其他包下 的子类，创建的对象可以访问
//    Zi.method();  // 其他子类下无法访问
//    Zi.privateMethod();  // 其他包下子类无法访问
  }
}
