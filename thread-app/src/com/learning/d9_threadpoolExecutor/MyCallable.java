package com.learning.d9_threadpoolExecutor;

import java.util.concurrent.Callable;

class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    // 重写call 方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "子线程和sum=" + sum;
    }
}