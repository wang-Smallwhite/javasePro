package com.learning.d5_thread_safe;
// 取钱线程类
public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
