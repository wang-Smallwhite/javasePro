package com.learning.d1_static;

public class staticFieldDemo1 {
    private int card;
    public static void main(String[] args) {
        // 目标：理解 static 修饰成员变量的作用和访问特点
        // 1、类名.静态成员变量
        System.out.println(User.onlineNumber);

        // 2. 对象名.实例成员变量
//        System.out.println(User.name);  // 报错 成员变量不通过 类名.成员变量访问
        User u = new User();
        u.name = "张三";
        System.out.println(u.name);


//        调用静态成员方法  类名访问
        staticFieldDemo1.getMax(12, 32);
        // 对象名访问 语法可行 但是不推荐
        staticFieldDemo1 s = new staticFieldDemo1();
         // s.staticFieldDemo1()

        // 调用 实例成员方法
        s.study();
        // 但是不能通过类名来访问
//        staticFieldDemo1.study();

    }

    /*
     * 静态成员方法（有 static 修饰，归属于类）， 建议用类名访问， 也可以用对象访问
     * */
    public static int getMax(int age1, int age2) {
//        System.out.println(card);  静态方法只能访问静态变量，不能访问实例成员
//        System.out.println(this.card);  // this 关键字不能在静态变量中
        return age1 > age2 ? age1 : age2;
    }

    /*
     * 实例成员方法（无 static 修饰，归属于对象），只能用对象出发访问, 属于对象的方法
     * */
    public void study() {
        System.out.println("好好学习");
    }

    /*
    * 使用场景
    * ⚠️ 表示对象自己的行为的，且方法中需要访问实例成员的，则该方法必须申明成实例方法。
    * ⚠️ 如果该方法是以实现执行一个公用功能为目的，则可以申明成静态方法
    * */








    /*
    * ⚠️ 静态方法只能访问静态成员，不可以直接访问实例成员
    * ⚠️ 实例方法可以访问静态成员，也可以访问实例成员
    * ⚠️ 静态方法中是不可以出现 this 关键字的
    * */
}
