package com.learning.d2_create_Runnable;
/*
* 目标： 学会线程的创建方式二
* 优点： 线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强
* 缺点：线程执行有结果是不可以返回的，
* */
public class Test {
    public static void main(String[] args) {
        // 3、创建一个任务对象
        Runnable target = new MyRunnable();
        // 4、把任务对象交给 Thread 处理
        Thread t = new Thread(target);
        // 5、启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}


// 1、定义一个线程人物类 实现 Runnable 接口

class MyRunnable implements Runnable {
    // 2、 重写run 方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}