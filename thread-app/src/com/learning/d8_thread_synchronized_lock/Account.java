package com.learning.d8_thread_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    // final 修饰后： 唯一不可替换的所对象
    private final Lock lock = new ReentrantLock();
    private double money;

    public Account() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(double money) {
        this.money = money;
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lock.lock();  // 上锁
//        放到 try finally 中 防止死锁，无论代码出现任何问题，都可以保证解锁
        try {
            // 判断账户余额
            if(this.money >= money) {
                // 执行取钱逻辑
                System.out.println(name + "取钱成功" + money);
                // 更新余额
                this.money -= money;
                System.out.println(name + "剩余：" + this.money);

            }else {
                System.out.println(name + "没钱了");
            }
        } finally {
            lock.unlock(); // 解锁

        }
    }
}
