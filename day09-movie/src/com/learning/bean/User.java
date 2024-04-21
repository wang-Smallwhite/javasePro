package com.learning.bean;
// 用户类
public class User {
  private String loginName;
  private String userName;
  private String passWord;
  private String phone;
  private char sex;
  private double money;

  public User() {
  }

  public User(String loginName, String userName, String passWord, String phone, char sex, double money) {
    this.loginName = loginName;
    this.userName = userName;
    this.passWord = passWord;
    this.phone = phone;
    this.sex = sex;
    this.money = money;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }
}
