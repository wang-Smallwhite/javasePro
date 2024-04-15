package com.learning.d1_date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

// Date 类的时间处理
public class Test {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());


        // 格式化时间 工具 SimpleDateFormat
       SimpleDateFormat sdf =  new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        System.out.println(sdf.format(d));
        System.out.println("==============================");
        /*
        * 解析时间
        *
        * 有一个时间 2024年04月13日 11:11:11 往后走 2天14小时49分 06秒 的时间是多少
        * */
        String str = "2024年04月13日 11:11:11";
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = simpleDateFormat.parse(str);
        System.out.println(date);
        long time = date.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;
        System.out.println(simpleDateFormat.format(time));



        // 系统日期日历  Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));
    }
}


