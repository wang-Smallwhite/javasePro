package com.learning.d8_bigdecimal;


import java.math.BigDecimal;
import java.math.RoundingMode;

// BigDecimal
public class Test {
    public static void main(String[] args) {
        // 浮点型运算会失精度，有误差
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.31);
        System.out.println(1.015 * 100);
        System.out.println(1.031 / 100);

        System.out.println("================================================");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("==============================");
        // 包装浮点数成为 大数据对象 BigDeciaml
        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal b1 = BigDecimal.valueOf(b);
//        BigDecimal c1 = a1.add(b1);
//        BigDecimal c1 = a1.subtract(b1);
//        BigDecimal c1 = a1.multiply(b1);
        BigDecimal c1 = a1.divide(b1);

        System.out.println(c1);

        // 目的 ： double
        double rs = c1.doubleValue();
        System.out.println(rs);

        // ⚠️ BigDecimal 是一定要精度运算的
        BigDecimal x = BigDecimal.valueOf(10.0);
        BigDecimal y = BigDecimal.valueOf(3.0);
        // 当遇到除不尽会直接报错； divide 会有后续参数， 参数一： 除数； 参数二： 保留小数位； 参数三：舍入模式
        BigDecimal m = x.divide(y, 2, RoundingMode.HALF_UP);
        System.out.println(m);
    }
}
