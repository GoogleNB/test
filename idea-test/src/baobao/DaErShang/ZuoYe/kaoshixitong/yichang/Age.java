package baobao.DaErShang.ZuoYe.kaoshixitong.yichang;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/17 12:28
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Age.java
 * @Software：IntelliJ IDEA
 */
public class Age {


    public static void main(String[] args) {
        User s1 = new User("张三");
        User s2 = new User("李四");
        try {
            s1.setAge(-20);
            System.out.println("张三的年龄是"+s1.getAge());
        } catch (AgeException e) {
            System.out.println(e.toString());
        }
        try {
            s2.setAge(-20);
            System.out.println("李四的年龄是"+s2.getAge());
        } catch (AgeException e) {
            System.out.println(e.toString());
        }
    }

}
