package com.learning.d9_interface_implements;

/*
* 实现类
* 接口与类的关系， 关键词 implements 可多实现
* */
public class PingPongMan implements SportMan, Law {
  private String name;

  public PingPongMan(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(name + "需要跑步训练");
  }

  @Override
  public void competition() {
    System.out.println(name + "需要夺冠");
  }

  @Override
  public void read() {
    System.out.println(name + "需要阅读");
  }
}
