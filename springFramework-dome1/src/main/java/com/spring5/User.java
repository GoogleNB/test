package com.spring5;

/**
 * @Date ：2022/5/1 12:05
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：User.java
 * @Software：IntelliJ IDEA
 */
public class User {
    private String name;
    public void add(){
        System.out.println("add....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
