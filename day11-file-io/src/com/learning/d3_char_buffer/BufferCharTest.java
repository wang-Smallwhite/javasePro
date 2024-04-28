package com.learning.d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 目标：完成出师表顺序的恢复，并存入到另一个新文件中去。
 */
public class BufferCharTest {
  public static void main(String[] args) {
    try(
        // 定义读取文件管道
        BufferedReader rd = new BufferedReader(new FileReader("day11-file-io/src/csb.txt"));

        // 定义输出管道
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11-file-io/src/csbNew.txt"))
        ) {
        // 定义列表
      List<String> list = new ArrayList<>();
      String line;
      while((line = rd.readLine()) != null) {
        list.add(line);
      }
      System.out.println(list);
      // 自定义排序规则
      List<String> sizes = new ArrayList<>();
      Collections.addAll(sizes, "一","二","三","四","五","陆","柒","八","九","十","十一");
      Collections.sort(list, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          return sizes.indexOf(o1.substring(0, o1.indexOf(".")))
              - sizes.indexOf(o2.substring(0, o2.indexOf(".")));
        }
      });
      System.out.println(list);
      for (String s : list) {
        bw.write(s);
        bw.newLine();
      }

    }catch(Exception e) {
      e.printStackTrace();
    }
  }
}
