package com.learning.d3_create_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 学会线程的创建方式 三： 实现 Callable 接口， 结合 FutureTask 完成
* 优点： 可以在线程执行完毕有，去获取线程的执行结果
* */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3、创建 Callable 任务对象
        Callable<String> call = new MyCallable(100);
        // 4、把 Callable 任务对象 交给 FutureTask 对象
        // FutureTask 对象的作用： 是 Runnable的对象，可以交给 Thread
        // FutureTask 对象的作用： 可以在线程执行完成之后，通过调用get 方法 得到线程执行完成的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        // 5、 交给线程处理
        Thread t1 = new Thread(f1);
        t1.start();
        try{
            String s1 = f1.get();
            System.out.println(s1);
        }catch (Exception e) {
            e.printStackTrace();
        }
        Callable<String> call1 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call1);
        // 5、 交给线程处理
        Thread t2 = new Thread(f2);
        t2.start();
        try{
            // get 方法 会等线程执行完毕才去拿返回值
            String s2 = f2.get();
            System.out.println(s2);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 定义一个任务类，实现 Callable 接口
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
        return "子线程和sum=" + sum;
    }
}
