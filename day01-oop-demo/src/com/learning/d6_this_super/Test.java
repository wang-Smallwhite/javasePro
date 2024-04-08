package com.learning.d6_this_super;

public class Test {
  /*
   * this: 本类对象的引用； super: 父类存储空间的标识
   * this.成员变量    this.成员方法     this() 访问本类构造器
   *  super.成员变量    super.成员方法    super() 访问父类构造器
   *
   *
   * */
  public static void main(String[] args) {
    // 案例 体验 this() 访问本类构造器
    // 注意 this() super() 都只能放在构造器的第一行，所以二者不能共同存在
    // 在学院信息登记中，后台创建了对象封装数据，如果用户没有输入学校，默认使用 “哈尔滨工业大学”； 如果输入的学校则使用输入信息

    School a = new School();
    School b = new School("李华");
    School c = new School("王五", "国防科技大学");
    System.out.println(a.getName()+ "来自" +a.getSchool());
    System.out.println(b.getName()+ "来自" +b.getSchool());
    System.out.println(c.getName()+ "来自" +c.getSchool());
  }
}


class School {
  private String name;
  private String school;

  public School(){}
  public School(String name) {
    // super(); // 如果当前类是继承了父类，调用super 会出错，且this（） 也需要在第一行调用
    this(name, "哈尔滨工业大学");
  }
  public School(String name, String school) {
    // super(); // 放在这个位置，先执行 上面的 School 在去初始化父类，然后执行下列语句
    this.name = name;
    this.school = school;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }
}
