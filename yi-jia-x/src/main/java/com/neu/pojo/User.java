package com.neu.pojo;

/**
 * @Date ：2022/5/7 15:07
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：User.java
 * @Software：IntelliJ IDEA
 */
public class User {
    private String id;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
