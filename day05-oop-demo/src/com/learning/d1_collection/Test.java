package com.learning.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        /*
        * 明确 collection
        *
        * */
        // 有序  可以重复
        ArrayList<String> list = new ArrayList<>();

        // 无序 不重复
        HashSet<String> hMap = new HashSet<>();


        // 定义集合 方式
        Collection<String> arr = new ArrayList<>();
        // 添加元素   add
        arr.add("67");
        arr.add("ui");
        arr.add("jsa");
        arr.add("java");
        arr.add("往");
        arr.add("java");

        System.out.println(arr);

        // 清空集合  clear
//        arr.clear();
//        System.out.println(arr);

        // 判断集合是否为空     isEmpty
        System.out.println(arr.isEmpty());

        // 获取集合长度  size
        System.out.println(arr.size());

        // 判断集合是否包含某元素   contains
        System.out.println(arr.contains("java"));
        System.out.println(arr.contains("jaa"));

        // 删除某个元素，如果有重复默认删除第一个  remove
        System.out.println(arr.remove("java"));
        System.out.println(arr.remove("jaa"));
        System.out.println(arr);

        // 把集合转换成 数组       toArray()
        Object[] arrs = arr.toArray();
        System.out.println(Arrays.toString(arrs));


        System.out.println("-----------------------扩展--------------------------");

        Collection<String> c = new ArrayList<>();
        c.addAll(arr);
        System.out.println(c);
    }
}
