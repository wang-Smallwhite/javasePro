package com.learning.d5_thread_safe;

// 模拟取钱线程安全问题
// 多个线程同时访问同一个共享资源且存在修改该资源
public class Test {
    public static void main(String[] args) {
        // 1、定义线程类，创建一个共享的账户对象
        Account acc = new Account(100000);

        // 2、创建两个线程对象，代表小明和小红同事进来
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}
