package com.learning.d2_recusion;

import java.io.File;

/*
* 非规律化递归  -------- 文件搜索
* */
public class FileQuery {

  // 查找项目中 FileQuery.java 文件
  public static void main(String[] args) {
    File f = new File("day10-file");

    queryFile(f, "FileQuery.java");
  }

  public static void queryFile(File dir, String fileName) {
    if(dir!= null && dir.isDirectory()) {
      File[] files = dir.listFiles();
      // 判断是否存在 一级文件对象
      if(files !=null && files.length > 0) {
        for (File file : files) {
          // 判断当前遍历的一级文件对象是文件还是文件夹
          if(file.isFile()) {
            if(file.getName().equals(fileName)) {
              System.out.println("找到文件："+ file.getPath());
              System.out.println("找到文件："+ file.getAbsoluteFile());
            }
          }else {
            queryFile(file, fileName);
          }
        }
      }
    }else {
      System.out.println("当前文件夹不支持搜索");
    }

  }
}
