package com.learning.d10_Exectors;

import com.learning.d9_threadpoolExecutor.myRunnalbe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* Executors
* 线程池对象的工具方法
* */
public class Test {
    public static void main(String[] args) {
        // 创建固定线程的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new myRunnalbe());
        pool.execute(new myRunnalbe());
        pool.execute(new myRunnalbe());
//        pool.execute(new myRunnalbe());
//        pool.execute(new myRunnalbe());   // 只执行前三个，后续的都不会执行

    }
}
