package com.learning.d4_byte_steam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 目标：使用文件字节输入流每次读取一个字节数组的数据。
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("day10-file/src/data.txt");
        // 当文件中 是 abcde 时
        // 定一个字节数组
//        byte[] buffer = new byte[3];

//        int len = is.read(buffer);
//        System.out.println(len);  // abc
//        System.out.println(new String(buffer));

//        int len1 = is.read(buffer);
//        System.out.println(len1);   // 只读取了两个字节， de ， 合并上了上次的c 所以得出下边的输出
//        System.out.println(new String(buffer));  // dec

        // 解决上诉问题： 读取多少倒出多少字节
//        int len2 = is.read(buffer);
//        System.out.println(new String(buffer, 0, len2));  // de

        // 改进： 使用循环每次读取一个字节数组
        // 通过 数组字节数 读取文件也避免不了乱码， adcde哎er
        byte[] bf = new byte[3];
        int leng;
        while( (leng = is.read(bf)) != -1) {
            System.out.println(new String(bf, 0, leng));
        }
    }
}
