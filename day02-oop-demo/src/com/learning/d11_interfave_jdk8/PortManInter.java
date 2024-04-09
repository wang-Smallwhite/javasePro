package com.learning.d11_interfave_jdk8;


public interface PortManInter {
  /*
  * 1、 JDK 8 开始： 默认方法
  * -- 必须使用 default 修饰， 默认使用 public 修饰
  * 默认方法，接口不能创建对象，这个方法只能过继给实现类，由实现类调用
  * */
  public default void run(){
    System.out.println("default方法 run");
    go();
  }

  /*
  * 2、静态方法
  * 必须使用 static 修饰， 默认用public
  * -- 接口的静态方法，必须接口名自己调用
  *
  * */
  static void inAddr() {
    System.out.println("static inAddr");
//    go();
  }

  /*
  * 3、私有方法
  * JDK 1.9 开始才支持
  * -- 必须接口内部才能访问
  * */
  private void go() {
    System.out.println("private go");
  }
}

class PingPongMan implements PortManInter {

}

class Test {
  public static void main(String[] args) {
    PingPongMan p = new PingPongMan();
    p.run();
//    p.go();
    PortManInter.inAddr();
//    PortManInter.go();
  }
}