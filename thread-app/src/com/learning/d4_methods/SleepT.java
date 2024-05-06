package com.learning.d4_methods;

/*
* 线程休眠 多少秒后执行
* sleep
* */
public class SleepT {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("输出：" + i);
            if (i == 3) {
                Thread.sleep(3000);
            }
        }
    }
}
