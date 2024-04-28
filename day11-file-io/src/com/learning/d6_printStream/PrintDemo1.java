package com.learning.d6_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 目标：学会使用打印流 高效  方便写数据到文件。
 */
public class PrintDemo1 {
  public static void main(String[] args) throws Exception {
    // 1、创建一个打印流对象
//        PrintStream ps = new PrintStream(new FileOutputStream("day11-file-io/src/ps.txt"));
//        PrintStream ps = new PrintStream(new FileOutputStream("day11-file-io/src/ps.txt" , true)); // 追加数据，在低级管道后面加True
//        PrintStream ps = new PrintStream("day11-file-io/src/ps.txt" );
    PrintWriter ps = new PrintWriter("day11-file-io/src/ps.txt"); // 打印功能上与PrintStream的使用没有区别

    ps.println(97);
    ps.println('a');
    ps.println(23.3);
    ps.println(true);
    ps.println("我是打印流输出的，我是啥就打印啥");

    ps.close();
  }
}