package com.learning.d6_stringbuilder;


// 学会使用 stringBuilder ，最终还需要知道它性能好的原因
public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append(1).append("ui").append(false);
        System.out.println(sb);
        // 返转
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());

        // StringBuilder 之上拼接字符串效果好，最终的效果还是要回归 String
        String rs = sb.toString();
    }
}
