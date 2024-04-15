package com.learning.d6_regular;


// https://docs.oracle.com/javase/8/docs/api/
// 查询 pattern
public class Test {
    public static void main(String[] args) {
//        认识正则校验
        // 校验qq号吗， 必须全部数字 6-20 位
//        System.out.println(checkQQ("9239829389"));

        // 使用正则表达式来判断
        System.out.println(checkQQRegular("90345d"));
    }

    public static boolean checkQQRegular(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq) {
        if (qq == null || qq.length() < 6 || qq.length() > 20) return false;
        // 判断 是否全部为数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
