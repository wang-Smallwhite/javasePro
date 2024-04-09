package com.learning.d7_abstract_template;

public class Test {
  /*
  * 模板方法的使用与特征
  * 注意 💗💗
  * 模板方法建议用 final 修饰，因为模板方法是给子类直接使用，不是让子类重写的，如果子类重写模板方法，那么模板方法就失效了；
  * */
  public static void main(String[] args) {
    StudentChild sc = new StudentChild();
    sc.write();
  }

}

abstract class Student{

  // 模板方法
  public final void write(){
    System.out.println("\t\t\t\t 我的爸爸");
    System.out.println("第一段");
    // 模板方法 将 不同的代码块定义成抽象方法，交给具体的子类去实现
    writeMain();
    System.out.println("结尾");
  }
  public abstract void writeMain();
}

class StudentChild extends Student {


  @Override
  public void writeMain() {
    System.out.println("正文部分");
  }
}