package com.learning.d2_stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class UseStream {

    public static void main(String[] args) {
        /* ------------------------------Collection集合获取stream-----------------------------------*/
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();


        /* ------------------------------Map集合获取stream-----------------------------------*/
        Map<String, Integer> maps = new HashMap<>();
        maps.put("id", 12);
        // 键 流
        Stream<String> keys =  maps.keySet().stream();
        // 值 流
        Stream<Integer> vals = maps.values().stream();
        // 键值对流
        Stream<Map.Entry<String, Integer>> keyVal = maps.entrySet().stream();

        /* ------------------------------数组 获取stream-----------------------------------*/
        String[] arr = {"赵敏","王二"};
        Stream<String> name = Arrays.stream(arr);
        Stream<String> names = Stream.of(arr);
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
