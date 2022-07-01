package baobao.LIANxi.StringLianXi;

import java.io.UnsupportedEncodingException;

/**
 * -*- coding = utf-8 -*-
 *1990-01-01开始，三天打鱼两天晒网，某年某月某日是打鱼还是晒网
 * @Time:2021/10/21 20:51
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：DateT.java
 * @Software：IntelliJ IDEA
 */
public class DateT {
//    public static void main(String[] args) {
//        Date date1 = new Date("1990-1-1");
//        System.out.println(date1.toString());//Sat Feb 16 16:35:31 GMT+08:00 2019
//
//        System.out.println(date1.getTime());//1550306204104
//
//        //构造器二：创建指定毫秒数的Date对象
//        Date date2 = new Date(155030620410L);
//        System.out.println(date2.toString());
//
//    }
public static void main(String[] args)  {
    String name = "嘉然今天吃什么";
    try {
        name = new String(name.getBytes("GB2312"), "ISO8859-1");
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }

    try {
        name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println(name);
}
}
