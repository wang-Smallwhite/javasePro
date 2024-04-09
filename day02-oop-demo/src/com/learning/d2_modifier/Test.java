package com.learning.d2_modifier;

public class Test {
  /*
  * 权限修饰符
  * */

  public static void main(String[] args) {
    Fu f = new Fu();

    //  f.privateMethod(); 私有的无法访问
    f.protectedMethod();
    f.publicMethod();
    f.method();
  }
}
