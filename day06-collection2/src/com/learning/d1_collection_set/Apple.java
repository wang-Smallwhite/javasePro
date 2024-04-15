package com.learning.d1_collection_set;

import java.util.Objects;

public class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    /**
      方式一：类自定义比较规则
      o1.compareTo(o2)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Apple o) {
        // 按照重量进行比较的
        return this.weight - o.weight ; // 去重重量重复的元素
        // return this.weight - o.weight >= 0 ? 1 : -1; // 保留重量重复的元素
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, color, price, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(price, apple.price) == 0 && weight == apple.weight && Objects.equals(name, apple.name) && Objects.equals(color, apple.color);
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true; // 如果是同一个对象，则相等
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false; // 如果参数对象为null或者不是同一个类的实例，则不相等
//        }
//        Apple other = (Apple) obj; // 将参数对象转换为当前类的实例
//        // 逐个比较属性是否相等
//        return color == other.color && Objects.equals(name, other.name) && Objects.equals(price, other.price) && Objects.equals(weight, other.weight);
//
//    }
}
