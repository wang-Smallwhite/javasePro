package com.learning.d9_threadpoolExecutor;

import java.util.concurrent.*;

public class ThreadPoolDemo1 {
    /*
    * public ThreadPoolExecutor(int corePoolSize,  //
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler) {
    *参数一：指定线程池的线程数量（核心线程）： corePoolSize             不能小于 0
    参数二：指定线程池可支持的最大线程数： maximumPoolSize                 最大数量 >= 核心线程数量
    参数三：指定临时线程的最大存活时间： keepAliveTime                    不能小于 0
    参数四：指定存活时间的单位 ( 秒、分、时、天 ) ： unit                                时间单位
    参数五：指定任务队列： workQueue                                       不能为 null
    参数六：指定用哪个线程工厂创建线程： threadFactory                        不能为 null
    参数七：指定线程忙，任务满的时候，新任务来了怎么办： handler                 不能为 null
    * */

    /*
    * 自定义一个线程池
    * */
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // 给任务到线程池处理
        Runnable target = new myRunnalbe();

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);



        // 关闭线程池， （开发中一般不使用）
        pool.shutdownNow(); // 立即关闭，即使任务没有完成，回丢失任务
        pool.shutdown();  // 会等待全部任务执行完毕之后在关闭
    }
}
