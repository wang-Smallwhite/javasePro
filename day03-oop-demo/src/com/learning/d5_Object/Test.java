package com.learning.d5_Object;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("十七", "男", 20);
        Student s2 = new Student("十七", "男", 20);
        System.out.println(s1);
//        System.out.println(s1.equals(s2));  // false  没有重写之前 比较两个对象的地址
        System.out.println(s1 == s2);   // false    比较两个对象的地址
        System.out.println(s1.equals(s2));  // 重写equals后 比较对象中的属性


//        Objects.equals()
        String x = null;
        String y = new String("it");
//        System.out.println(x.equals(y));  // 可能会出现空指针异常
        System.out.println(Objects.equals(x, y));
    }
}


// 子类重写 object.toString()

class Student {
    private String name;
    private String sex;
    private int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写 equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }
}