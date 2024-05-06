package com.learning.d6_thread_synchronized_code;

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

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        // 同步代码快
        /*
        * 锁对象的规范要求
        * 建议使用共享资源作为对象
        * 对于实例方法建议使用this 作为锁对象
        * 对于静态方法建议使用 字节码（类名.class）作为锁对象
        * */
        synchronized (this) {
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
//    静态方法 锁对象
//    public static void run() {
//        synchronized (Account.class){
//
//        }
//    }
}
