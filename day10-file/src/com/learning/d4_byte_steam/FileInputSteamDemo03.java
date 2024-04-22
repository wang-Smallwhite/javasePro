package com.learning.d4_byte_steam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 目标：使用文件字节输入流一次读完文件的全部字节。可以解决乱码问题。
    ⚠️： 如果文件过大，会导致数组内存溢出
 */
public class FileInputSteamDemo03 {
    public static void main(String[] args) throws Exception {
        File file = new File("day10-file/src/data.txt");
        InputStream is = new FileInputStream(file);
//        byte[] buffer = new byte[(int) file.length()];
//        int len = is.read(buffer);
//
//        System.out.println(new String(buffer));

        // ⚠️： 新 api  一次性读取所有字节
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
