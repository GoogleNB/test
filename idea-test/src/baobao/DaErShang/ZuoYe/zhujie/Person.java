package baobao.DaErShang.ZuoYe.zhujie;

import jdk.jfr.Label;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:54
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：asd.java
 * @Software：IntelliJ IDEA
 */

public class Person {

    @Label("姓名")
    private String name;

    @Label("性别")
    private String sex;

    @Label("年龄")
    private Integer age;

    @Label("身份证号码")
    private String idNo;

    @Label("婚否")
    private Boolean isMerried;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Boolean getIsMerried() {
        return isMerried;
    }

    public void setIsMerried(Boolean isMerried) {
        this.isMerried = isMerried;
    }

}
