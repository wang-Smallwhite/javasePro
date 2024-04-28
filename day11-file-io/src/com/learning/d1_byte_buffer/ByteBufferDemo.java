package com.learning.d1_byte_buffer;

import java.io.*;

/*
* 目标：使用字节缓冲流完成数据的读写操作。
* */
public class ByteBufferDemo {
  public static void main(String[] args) {
    try(
        // 这里只能防止资源对象，用完会自动关闭，自动调用资源对象的close 方法关闭资源 计师出现异常也会关闭
        //1、 创建一个字节输入流管道与原视频接通
        InputStream is = new FileInputStream("day11-file-io/src/out01.txt");
        // 把原始的字节输入流包装成高级的缓冲字节输入流
        InputStream bis = new BufferedInputStream(is);
        // 2、创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("day11-file-io/src/out1.txt");
        // 把原始的字节输出流包装成高级的缓冲字节输出流
        OutputStream bos = new BufferedOutputStream(os);
        ) {
      byte[] buffer = new byte[1024];
      int len; // 记录每次读取的字节数
      while ((len = bis.read(buffer)) != -1) {
        bos.write(buffer, 0, len);
      }
      System.out.println("复制完成");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
