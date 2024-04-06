package com.learning.d1_static;

public class User {
    /*
    * 在线人数
    * ⚠️ static 修饰的成员变量：静态成员变量，只在内存中有一份，可以被共享
    * */

    public static int onlineNumber = 182;

    String name;
    private int age;
    /*
    * 实例成员变量： 无 static修饰，属于每个对象的，必须使用对象名.访问
    * */
    public static void main(String[] args) {
        User u = new User();
        u.name = "张三";
        u.age = 23;
        System.out.println(u.name);
        System.out.println(u.age);
        u.onlineNumber++;
        System.out.println(u.onlineNumber);

        // 同一个类中，访问静态成员变量可以直接写成员变量名
        System.out.println(onlineNumber);

        User u1 = new User();
        u1.onlineNumber++;
        System.out.println(u1.onlineNumber);  // 184
    }
}
