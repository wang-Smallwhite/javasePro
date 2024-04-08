package com.learning.d1_singletonmode;


/*
* 饿汉 单例模式
* 需要私有化 构造器
* 向外暴露对象， 用户不能new
*
*
* */
public class SingletonMode {
    // 1、 私有化 构造器
    private SingletonMode() {}

    // 2、 向外暴露对象
    public static SingletonMode instance = new SingletonMode();

}
