package com.learning.d1_singletonmode;
/*
* 懒汉 单例模式
*
* */
public class SingletonMode2 {
    // 私有化构造器
    private SingletonMode2() {}

    // 私有化对象 且不new
    private static SingletonMode2 instance;

    // 向外暴露
    public static SingletonMode2 getInstance() {
        // 判断 instance 是否已被创建
        if(instance == null) instance = new SingletonMode2();
        return instance;
    }
}
