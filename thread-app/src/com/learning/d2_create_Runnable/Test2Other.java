package com.learning.d2_create_Runnable;
// 匿名内部类实现
public class Test2Other {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程：" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();
//        子线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1：" + i);
                }
            }
        }).start();
        // 子线程2
        new Thread( () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2：" + i);
                }
        }).start();


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程：" + i);
        }


    }
}
