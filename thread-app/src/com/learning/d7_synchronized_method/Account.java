package com.learning.d7_synchronized_method;

public class Account {

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

    // 加同步方法 synchronized 实现
    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();
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
    }
}
