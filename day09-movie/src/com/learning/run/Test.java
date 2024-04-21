package com.learning.run;

import com.learning.bean.Business;
import com.learning.bean.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
  public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

  public static void main(String[] args) throws ParseException {
    Business business = new Business();
    Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    Business b = new Business();
    b.setLoginName("baozugong888");
    b.setPassWord("123456");
    b.setUserName("黑马包租公");
    b.setMoney(0);
    b.setSex('男');
    b.setPhone("110110");
    b.setAddress("火星6号2B二层");
    b.setShopName("甜甜圈国际影城");
    // 注意，商家一定需要加入到店铺排片信息中去
    List<Movie> movies = new ArrayList<>();
    ALL_MOVIES.put(b , movies); // b = []

    Movie movie = new Movie("倩女幽魂", "作者", 120.0, 300.0,300, sdf.parse("2024/12/12 12:12:12"));

  }
}
