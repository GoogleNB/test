package JDBC;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/8 16:57
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Kaos.java
 * @Software：IntelliJ IDEA
 */
public class Kaos {
    String name;
    String sex;
    int age;

    @Override
    public String toString() {
        return "Kaos{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
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

    public Kaos() {
    }
}
