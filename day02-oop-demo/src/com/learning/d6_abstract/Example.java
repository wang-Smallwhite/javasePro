package com.learning.d6_abstract;

public class Example {
  /*
  * 某加油站推出两种支付卡，一种是 存10000的金卡， 后续加油 8 折优惠； 一种是 5000 的银卡， 后续加油 8.5 折的优惠
  * 卡片需要包含主人名称、余额、支付功能
  * */
  public static void main(String[] args) {
    CardJin j = new CardJin();
    j.pay(900);
    CardYin y = new CardYin();
    y.pay(900);
  }
}
// 定义 卡片
abstract class Card {
  private String name;
  private Double money;
  // 支付方法
  public abstract void pay(double n);


  public Card(){}
  public Card(String name, Double money) {
    this.name = name;
    this.money = money;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }
}

class CardJin extends Card{

  @Override
  public void pay(double n) {
    double payMoney = n * 0.8;
    System.out.println("需要支付" + payMoney);
  }
}

class CardYin extends Card{

  @Override
  public void pay(double n) {
    double payMoney = n * 0.85;
    System.out.println("需要支付" + payMoney);
  }
}