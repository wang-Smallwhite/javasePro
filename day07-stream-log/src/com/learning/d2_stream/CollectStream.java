package com.learning.d2_stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectStream {
  /*
  * 收集 stream 流， stream只是操作手段，最终目的还是要回归到 集合 类型中
  * */
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("java");
    list.add("java");
    list.add("js");
    list.add("java");
    list.add("java");
    list.add("java");
    list.add("js");

    List<String> listFilter = list.stream().filter(e -> e.equals("js")).collect(Collectors.toList());
    System.out.println(listFilter);

    Set<String> setList = new HashSet<>();
    setList.add("html");
    setList.add("js");
    setList.add("css");
    setList.add("java");
    setList.add("spring");
    setList.add("mybatis");
    Set<String> setFilter = setList.stream().filter(e -> e.equals("html")).collect(Collectors.toSet());
    System.out.println(setFilter);

    Object[] arr = setList.toArray();
    System.out.println(Arrays.toString(arr));
    Object[] af = setFilter.toArray();
    System.out.println(Arrays.toString(af));
  }
}
