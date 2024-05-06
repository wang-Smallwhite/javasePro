package com.learning.d4_methods;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new MyThread("子线程1-");
//        t1.setName("子线程1-");
        t1.start();


        Thread t2 = new MyThread("子线程2-");
//        t2.setName("子线程2-");
        t2.start();

        // 哪个线程执行它，它就得到哪个线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
    }
}
