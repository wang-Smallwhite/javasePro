package com.learning.codeBlack;

import java.util.ArrayList;

public class StaticCodeBlack {
    public static String name;
    private String sex;
    public static void main(String[] args) {
        System.out.println("================main==============");
        System.out.println(name);

        StaticCodeBlack test = new StaticCodeBlack();
        System.out.println(test.sex);
    }
    // 理解静态代码块
    /*
    * 静态代码块， 有 static 属于类， 与类一起加载一次，自动触发执行
    * 初始化静态资源
    * */
    static {
        System.out.println("==========静态代码块===========");
        name = "初始化";

    }

    /*
    * 构造代码块 了解 少见
    * 属于对象，每次构建对象会执行， 初始化实例资源
    * 优先于 构造器执行
    * */
    {
        this.sex = "男";
        System.out.println("=================构造代码块=============");
    }


}
