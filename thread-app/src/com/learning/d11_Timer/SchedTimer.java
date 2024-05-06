package com.learning.d11_Timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/*
* 解决单一定时器的缺点，使用 ScheduledExecutorService
*
* */
public class SchedTimer {
    public static void main(String[] args) {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        // 开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行AAA" + new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 0, 2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行BBB" + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);

    }
}
