package baobao.LIANxi.IO;

import java.io.Serializable;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/20 15:54
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Person.java
 * @Software：IntelliJ IDEA
 */
public class Person implements Serializable {
    private String name;
    private int age;
    static final long serialVersionUID = -338751699359948L;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
