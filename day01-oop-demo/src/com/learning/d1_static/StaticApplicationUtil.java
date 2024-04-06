package com.learning.d1_static;


import java.util.Random;

/*
* static 工具类
*
* 类中都是一些静态方法，每个方法都可以被复用
* */
public class StaticApplicationUtil {
    // 由于工具类无需创建对象就可以调用，所以可以给构造器私有化
    private StaticApplicationUtil() {}

    /*
    * 静态方法
    * */
    public static String createVerifyCode(int n) {
        // 验证码
        String code = "";
        String data = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index =  r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }

    /*
    * 整数数组输出方法
    * */
    public static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        return result +"]";
    }
}
