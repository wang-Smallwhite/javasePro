package com.learning.d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

    /*
    * 创建不可变集合
    * */

    public static void main(String[] args) {

        // 不可变集合 List
        List<String> lists = List.of("1", "2");
        // 不能修改
//        lists.add("3");

        // 不可变集合 Set
        Set<Double> d = Set.of(99.9, 2.3);
//        d.add(90.2);

        // 不可变集合 Map
        Map<String, Integer> maps = Map.of("王大", 2, "李二", 3);
//        maps.put("张三", 4);
    }
}
