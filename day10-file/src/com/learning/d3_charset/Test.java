package com.learning.d3_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 编码
        String name = "abc绝对是";
        byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));

        byte[] bs = name.getBytes("GBK");
        System.out.println(Arrays.toString(bs));

        // 解码
        String rs = new String(bs);
        System.out.println(rs);  // 乱码
        System.out.println(new String(bs, "GBK"));
        String r = new String(bytes);
        System.out.println(r);
    }
}
