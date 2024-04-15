package com.learning.d7_system;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println("程序开始。。。。");
//        System.exit(0);  // JVM 终止

        // 获取时间毫秒值
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出" + i);
        }
        Long end = System.currentTimeMillis();
        System.out.println((end- start) / 1000.0 + "s");


        // 数组拷贝
        // arraycopy (Object src,  int srcPos, Object dest, int destPos,int length)
//        System.arraycopy();
        // 被拷贝数组， 从那个索引开始拷贝， 复制的目标数组， 粘贴位置， 拷贝元素的个数
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] arr1 = new int[6];
        System.arraycopy(arr, 3, arr1, 2,3);
        System.out.println(Arrays.toString(arr1));







        System.out.println("程序结束");
    }
}
