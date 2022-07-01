package baobao.DaErShang.ZuoYe.kaoshixitong.yichang;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/17 12:21
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：User.java
 * @Software：IntelliJ IDEA
 */
public class User {
    private int age=1;
    private String name;

    public User(String name) {
        this.name = name;
    }
    public void setAge(int age)throws AgeException{
        if (age>=50||age<=18)
            throw new AgeException(name,age);
        else
            this.age=age;
    }
    public int getAge(){
        System.out.println("年龄" + age + "输入正确");
        return age;
    }


}
