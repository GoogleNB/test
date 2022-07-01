package com.spring5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Date ：2022/5/8 12:11
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：dept.java
 * @Software：IntelliJ IDEA
 */
@Service(value = "dept1")
public class Dept {
    @Value("哈哈")
    private String name;

    @Override
    public String toString() {
        return "dept{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
