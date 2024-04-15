package com.learning.d5_packaging;

public class Test {

    /*
    * 包装类
    * 基本数据类型   byte     short     int          long    double  float   boolean     char
    * 引用数据类型  Byte     Short     Integer       Long   Double   Float  Boolean     Character
    *
    * 引用类型 默认值 可以是 null
    * */

    public static void main(String[] args) {
        int a = 10;
        Integer a1 = a;  // 自动装箱
        int b = a1; // 自动拆箱
        System.out.println(a1.toString());
//        int x = null;
        Integer y = null;
        Boolean bln = null;
        // 包类， 转换
        double score= Double.valueOf("12390.329");
        System.out.println(Double.parseDouble("12334.09"));
        System.out.println(score);
    }
}
