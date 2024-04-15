package com.learning.d2_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    /*
    * 员工信息包含（名称、性别、工资、奖金、处罚记录）
    * 开发一部： 4个人  开发二部： 5个人
    * 分别筛选出两个部门的最高工资的员工信息，封装成优秀员工对象 TopperFormer
    * 分别统计两个开发部门的平均月收入，要求去掉最高和最低
    * 统计两个部门整体的平均工资，去掉最低和最高的工资
    * */
    static double addMoney = 0;


    public static void main(String[] args) {
        List<Staff> one = new ArrayList<>();
        one.add(new Staff("猪八戒",'男',30000 , 25000, null));
        one.add(new Staff("孙悟空",'男',25000 , 1000, "顶撞上司"));
        one.add(new Staff("沙僧",'男',20000 , 20000, null));
        one.add(new Staff("小白龙",'男',20000 , 25000, null));
        List<Staff> two = new ArrayList<>();
        two.add(new Staff("武松",'男',15000 , 9000, null));
        two.add(new Staff("李逵",'男',20000 , 10000, null));
        two.add(new Staff("西门庆",'男',50000 , 100000, "被打"));
        two.add(new Staff("潘金莲",'女',3500 , 1000, "被打"));
        two.add(new Staff("武大郎",'女',20000 , 0, "下毒"));

//        获取第一部门薪资最高
//        Staff e = one.stream().max(new Comparator<Staff>() {
//            @Override
//            public int compare(Staff o1, Staff o2) {
//                return Double.compare(o1.getWages() + o1.getBonus(), o2.getBonus() + o2.getWages());
//            }
//        }).get();
//        System.out.println(e);

        // 获取第一部门薪资最高
        TopperFormer oneWagesMax = getMax(one);
        TopperFormer twoWagesMax = getMax(two);
        System.out.println(oneWagesMax);
        System.out.println(twoWagesMax);

        System.out.println("开发一部的平均工资：" + getAverage(one));
        System.out.println("开发二部的平均工资：" + getAverage(two));

        Stream<Staff> s1 = one.stream();
        Stream<Staff> s2 = two.stream();
        List<Staff> s3 = Stream.concat(s1, s2).collect(Collectors.toList());
        System.out.println("两个部门的平均工资：" + getAverage(s3));


    }

    // 获取部门最高薪资
    public static TopperFormer getMax(List<Staff> obj) {
        return obj.stream().max(((o1, o2) -> Double.compare(o1.getWages() + o1.getBonus(), o2.getBonus() + o2.getWages()))).map(m -> new TopperFormer(m.getName(), m.getWages()+m.getBonus())).get();
    }

    // 获取薪资平均值
    public static Double getAverage(List<Staff> obj) {
        addMoney = 0;
         obj.stream().sorted((x, y) -> Double.compare(x.getWages() + x.getBonus(), y.getWages() + y.getBonus())).skip(1).limit(obj.size() - 2).forEach(e -> {
             System.out.println(e);
             addMoney += (e.getBonus() + e.getWages());
        });
        System.out.println(addMoney);
         return Double.parseDouble(String.format("%.2f" ,addMoney / (obj.size() - 2)));
    }
}


class Staff {
    // 姓名
    private String name;
    // 性别
    private char sex;
    // 工资
    private double wages;
    // 奖金
    private double bonus;
    // 处罚记录
    private String records;


    public Staff() {
    }

    public Staff(String name, char sex, double wages, double bonus, String records) {
        this.name = name;
        this.sex = sex;
        this.wages = wages;
        this.bonus = bonus;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", wages=" + wages +
                ", bonus=" + bonus +
                ", records='" + records + '\'' +
                '}';
    }


}


class TopperFormer {
    private String name;
    private double wages;

    public TopperFormer() {
    }

    public TopperFormer(String name, double wages) {
        this.name = name;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "TopperFormer{" +
                "name='" + name + '\'' +
                ", wages=" + wages +
                '}';
    }
}