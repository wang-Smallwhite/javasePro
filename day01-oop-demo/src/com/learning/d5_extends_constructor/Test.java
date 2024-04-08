package com.learning.d5_extends_constructor;

public class Test {
  // 继承后子类构造器的特点
  // 子类的全部构造器默认会先访问父类的无参数构造器，再执行自己的构造器
  // 子类在初始化的时候，有可能用到父类的数据，如果父类没有完成初始化，会报错
  public static void main(String[] args) {
    Branch b = new Branch();
    System.out.println("+++++++++++++++++++++++++++++++++++");

    // super 调用 父类的有参构造器来初始化数据
    Branch h = new Branch("第一家", "北京");
    System.out.println(h.getName());
  }

}




class Company{
  private String name;
  private String address;

  public Company(String name, String address) {
    this.name = name;
    this.address = address;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Company() {
    System.out.println("父类无参数构造器");
  }
}

class Branch extends Company {
  public Branch () {
    super(); // 写不写都一样，默认九有
    System.out.println("子类的无参数构造器");
  }
  public Branch(String name, String address) {
    super(name, address); // 写不写都一样，默认九有
    System.out.println("子类的有参数构造器");
  }
}