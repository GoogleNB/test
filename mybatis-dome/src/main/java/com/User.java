package com;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/25 17:06
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：User.java
 * @Software：IntelliJ IDEA
 */
public class User {

    private String name;
    private String sex;
    private int old;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", old=" + old +
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

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
