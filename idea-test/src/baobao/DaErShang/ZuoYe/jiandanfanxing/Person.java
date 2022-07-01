package baobao.DaErShang.ZuoYe.jiandanfanxing;

import baobao.LIANxi.Fanshe.Pension;

import java.lang.reflect.InvocationTargetException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:42
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Person.java
 * @Software：IntelliJ IDEA
 */
public class Person {
    private String name;

    private String gender;

    private Integer age;

    public Person() {
    }
    public Person(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Class clazz= Person.class;
        try {
            Pension o = (Pension) clazz.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}