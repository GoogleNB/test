package com;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/16 13:22
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：User.java
 * @Software：IntelliJ IDEA
 */
public class User {
    private int id;
    private String name;
    private int password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
