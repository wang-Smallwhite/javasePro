package com.learning.d5_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 目标：学会进行对象反序列化：使用对象字节输入流把文件中的对象数据恢复成内存中的Java对象。
 */
public class ObjectInputStreamDemo2 {
  public static void main(String[] args) throws Exception {
    // 1、创建对象字节输入流管道包装低级的字节输入流管道
    ObjectInputStream is = new ObjectInputStream(new FileInputStream("day11-file-io/src/obj.txt"));

    // 2、调用对象字节输入流的反序列化方法
    Student s = (Student) is.readObject();

    System.out.println(s);
  }
}
