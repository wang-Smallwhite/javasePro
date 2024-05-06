package com.learning.d1_create;

public class Test{
    /*
    * 方式一 继承 Thread
    * 优点： 编译快，编码简单
    * 缺点： 类已经继承了 Thread 类，不便于继承其他类，不方便扩展
    * */
    public static void main(String[] args) {
        // 3、new 一个新线程对象
        Thread t = new MyThread();
        // 4、 调用start 方法启动线程（执行还是 run 方法）
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}

// 1、定义一个线程类继承Thread 类
class MyThread extends Thread {
//    2、重写run 方法，里面定义线程的逻辑
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}
