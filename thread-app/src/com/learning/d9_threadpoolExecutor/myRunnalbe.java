package com.learning.d9_threadpoolExecutor;

public class myRunnalbe implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
        try {
            Thread.sleep(100000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
