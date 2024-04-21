package com.learning.d2_recusion;

/*
* 递归的形式
*
* */
public class RecursionDemo {

  public static void main(String[] args) {
    System.out.println(ss(10));

    System.out.println(s(1));
  }

  public static long ss (long n) {
    if(n == 1) return 1;
    return ss(n-1) * n;
  }

  public static long s(long n) {
    if(n == 10) return 1;
    return 2* s(n+1) +2;
  }
}
