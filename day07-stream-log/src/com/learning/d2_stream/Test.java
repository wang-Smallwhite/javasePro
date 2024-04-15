package com.learning.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    /*
    * 初步体验 stream 流的方便与快捷
    * */
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists, "张三丰","张无忌","周芷若","赵敏","张强");

        // 从集合中找出姓张的
        List<String> zhangLists = new ArrayList<>();
        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if(s.startsWith("张")) {
                    zhangLists.add(s);
                }
            }
        });
        System.out.println(zhangLists);

        // 从集合中找出姓张的并且三个字的
        List<String> threeLists = new ArrayList<>();
        for (String list : lists) {
            if(list.startsWith("张") && list.length() == 3) {
                threeLists.add(list);
            }
        }
        System.out.println(threeLists);


        // 使用 stream 实现
        lists.stream().filter(s -> s.startsWith("张")&& s.length() == 3).forEach((s) -> System.out.println(s));

    }

}
