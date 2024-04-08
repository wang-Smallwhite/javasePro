package com.learning.d1_singletonmode;

/*
* 测试单例模式
* */
public class Test {

    public static void main(String[] args) {
        // 饿汉单例
        SingletonMode s1 = SingletonMode.instance;
        SingletonMode s2 = SingletonMode.instance;
        System.out.println(s1 == s2);  // true  // 共用一个存储地址
        // 懒汉 单例
        SingletonMode2 i1 = SingletonMode2.getInstance();
        SingletonMode2 i2 = SingletonMode2.getInstance();
        System.out.println(i1 == i2);
    }
}
