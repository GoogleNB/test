package com.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Date ：2022/5/8 12:10
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：emp.java
 * @Software：IntelliJ IDEA
 */

//value里写的是bean 的id 不写默认开头小写
@Component(value = "emp")
public class Emp {
    @Value("小米")
    private String name;
    @Value("66")
    private int age;


//   @Qualifier(value = "dept")


//    @Autowired
//    类型属性注解注入，不需要set方法，现已经推荐构造器注入
//    private Dept dept;

//名称属性注解注入
//    @Autowired
//    @Qualifier(value = "dept1")
//private Dept dept;




//@Autowired
////构造器注入
//    public Emp(Dept dept) {
//        this.dept = dept;
//    }

    private Dept dept;

//    @Autowired
//    //构造器注入
    public Emp(Dept dept) {
        this.dept = dept;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }
    @Autowired
    @Qualifier(value = "dept1")
    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
