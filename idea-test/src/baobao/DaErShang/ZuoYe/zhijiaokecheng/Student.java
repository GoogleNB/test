package baobao.DaErShang.ZuoYe.zhijiaokecheng;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/10 14:21
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Student.java
 * @Software：IntelliJ IDEA
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private boolean sex;
    public void eat() {
        System.out.println("学生在吃饭");
    }
    public void study() {
        System.out.println("学生可以学习");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
