package com.learning.d4_extends_override;

public class Test {
  public static void main(String[] args) {
    // 方法重写

    newPhone hw = new newPhone();
    hw.call();
    hw.sendMsg();
  }
}

// 旧手机
class Phone {
  public void call() {
    System.out.println("打电话");
  }

  public void sendMsg() {
    System.out.println("发短信");
  }
}

// 新手机

class newPhone extends Phone{
  // 重写校验注解， 加上之后， 这个方法必须是正确的重写
  // 还可以提高程序的可读性，代码优雅
  // 申明不变，方法重现
  /*
  * 注意：重写的方法的名称、形参列表必须与重写的方法一模一样
  * 私有方法不能被重写
  * 子类重写父类方法，访问权限必须大于或者等于父类（缺省 < protected < public）
  * 子类不能重写父类的静态方法，否则会报错
  * */
  @Override
  public void call() {
    super.call();
    System.out.println("打视频");
  }
  @Override
  public void sendMsg() {
    super.sendMsg();
    System.out.println("发送彩信");
  }
}