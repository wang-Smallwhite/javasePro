package com.learning.d11_Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/*
* 缺点： Timer 是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入
*       可能因为其中某个任务的异常使Timer线程死掉，从而影响后续任务执行
*
* */
public class Test {
    public static void main(String[] args) {
        // 创建 Timer 定时器
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行AAA" + new Date());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行BBB" + new Date());
            }
        }, 0, 2000);
    }
}
