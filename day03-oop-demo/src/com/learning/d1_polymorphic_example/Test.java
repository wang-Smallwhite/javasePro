package com.learning.d1_polymorphic_example;

public class Test {
  // USB 设备模拟
  /*
  * 1、定义 USB 接口 接入、拔出
  * 2、定义2个USB 实现类； 鼠标，键盘
  * 3、定义一个电脑类
  * */
  public static void main(String[] args) {
    Computer c = new Computer();
    USB u  = new Mouse("罗技");
    c.installUSB(u);
    USB k = new KeyBord("双飞燕");
    c.installUSB(k);
  }
}


class Mouse implements USB {
  private String name;

  public Mouse(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void content() {
    System.out.println(name + "已经成功接入设备~~~~~");
  }

  @Override
  public void unContent() {
    System.out.println(name + "已经成功弹出设备~~~~~");
  }

  public void click(){
    System.out.println("双击666");
  }
}


class KeyBord implements USB {
  private String name;

  public KeyBord(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void content() {
    System.out.println(name + "已经成功接入设备~~~~~");
  }

  @Override
  public void unContent() {
    System.out.println(name + "已经成功弹出设备~~~~~");
  }

  public void keyDown(){
    System.out.println("输入666");
  }
}

class Computer {
  public void installUSB (USB u) {
    u.content();
//    独有功能实现
    if(u instanceof Mouse) {
      ((Mouse) u).click();
    }else if (u instanceof KeyBord) {
      ((KeyBord) u).keyDown();
    }
    u.unContent();
  }
}