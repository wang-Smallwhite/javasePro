package com.learning.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/*
* 学会创建 File 对象定位操作系统文件
*
* */
public class Test {
  /*
  * 路径写法
  *   I:\javasePro\resources\2.jpg
  *   I:/javasePro/resources/2.jpg
  *   File.separator    适合不同平台上的编译
  * */
  public static void main(String[] args) {
//    File f = new File("I:\\javasePro\\resources\\2.jpg");
//    File f = new File("I:/javasePro/resources/2.jpg");
    File f = new File("I:" + File.separator + "javasePro"+ File.separator + "resources" + File.separator + "2.jpg");
    System.out.println(f.length());  // 获取文件字节大小

    // File 创建对象，支持绝对路径，也支持相对路径

    // 相对路径  默认直接到当前工程下的目录寻找
    File f1 = new File("day10-file/src/data.txt");
    System.out.println(f1.length());
    File f4 = new File("resources/data.txt");
    System.out.println(f4.length());
    
    // 创建的对象可以是文件，也可以是文件夹
    File f3 = new File("I:\\javasePro\\resources");
    System.out.println(f3.exists());  // 判断文件是否存在

    /*
    * File API
     * public String getAbsolutePath()  返回此 File 的绝对路径名字符床
     * public String getPath()  获取创建对象时用的路劲
     * public String getName()  返回此 File 表示的文件或目录名称
     * public long length()  返回此 File 的字节大小
    *
    * */
    System.out.println(f.getAbsoluteFile());
    System.out.println(f4.getAbsoluteFile());
    System.out.println(f.getPath());
    System.out.println(f4.getPath());
    System.out.println(f.getName());

    // 获取最后修改时间
    System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f.lastModified()));


    // 判断是否为文件或文件夹
    System.out.println(f.isFile());
    System.out.println(f3.isFile());
    System.out.println(f.isDirectory());
    System.out.println(f3.isDirectory());
  }
}
