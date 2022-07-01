package baobao.DaErShang.ZuoYe.jiandanfanxing;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:43
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：asd.java
 * @Software：IntelliJ IDEA
 */
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager<T> {
    private  List<T> personList = new ArrayList<>();



    /**添加人员的操作*/
    public void add(T t) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        addAtrribute(t);

        personList.add(t);
    }

    /**删除人的操作*/
    public void remove(T t) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner input = new Scanner(System.in);
        Class clazz = t.getClass();
//        System.out.println(clazz.getSimpleName());
        String bigName = "";
        if(clazz.getSimpleName().equals("Teacher")){
            System.out.print("请输入要删除的教师的教师号:");
            int id = input.nextInt();
            Teacher teacher = (Teacher) findById(id);
            if (teacher != null){
                personList.remove(teacher);
            }else{
                System.out.println("查无此人");
            }
        }else if(clazz.getSimpleName().equals("Student")){
            System.out.print("请输入要删除的学生的学号:");
            int id = input.nextInt();
            Student student = (Student) findById(id);
            if (student != null){
                personList.remove(student);
            }else{
                System.out.println("查无此人");
            }
        }

//        if(isExist(t)){
//            personList.remove(t);
//        }else{
//
//        }

    }
    /**根据id找人*/
    public<T> T findById(int id) throws IllegalAccessException {
        for (int i = 0; i < personList.size(); i++) {
            T person = (T)personList.get(i);
            Class clazz = person.getClass();
            List<Field> allFieldList = getAllField(clazz);
            for (Field field:allFieldList){
                field.setAccessible(true);
                if(field.get(personList.get(i)).equals(id)){
                    return person;
                }
            }

        }
        return null;

    }

    /**更新*/
    public void update(T t) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if(isExist(t)){
            personList.remove(t);
            add(t);
        }else{
            System.out.println("查无此人");
        }

    }
    /** 查找所有*/
    public List<T> findAll(int x){
        List<T> list = new ArrayList<>();
        if(x == 1){
            for(int i = 0;i < personList.size();i++){
                if (personList.get(i).getClass().getSimpleName().equals("Teacher")) {
                    list.add(personList.get(i));
                }
            }
        }
        if (x == 2){
            for(int i = 0;i < personList.size();i++){
                if (personList.get(i).getClass().getSimpleName().equals("Student")) {
                    list.add(personList.get(i));
                }
            }
        }
        return list;

    }
    /**检验是否存在此人*/
    public boolean isExist(T t) throws IllegalAccessException {
        T person = null;
        if(t.getClass().equals("Student")){
            Student student = (Student)t;
            person = findById(student.getStuId());
        }else{
            Teacher teacher = (Teacher)t;
            person = findById(teacher.getTeacherId());
        }
        if (person == null){
            return false;
        }else{
            return true;
        }
    }
    //获取所有属性的方法
    private   List getAllField(Class clazz){
        /**获取所有的属性*/
        List<Field> fieldList = new ArrayList<>();
        while(clazz != null){
            Field[] fields = clazz.getDeclaredFields();
            for(Field field:fields){
                fieldList.add(field);
            }
            clazz = clazz.getSuperclass();
        }
        return fieldList;
    }
    /** 添加属性方法*/
    private void addAtrribute(T t) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner input = new Scanner(System.in);
        Class clazz = t.getClass();
//        System.out.println(clazz.getSimpleName());
        String bigName = "";
        if(clazz.getSimpleName().equals("Teacher")){
            bigName = "教师";
        }else if(clazz.getSimpleName().equals("Student")){
            bigName = "学生";
        }
        /**获取所有的属性*/
        List<Field> fieldList = getAllField(clazz);

        for (Field field:fieldList) {
            String fieldName = field.getName();
            System.out.print("请输入此" + bigName + "的" + fieldName + ":");
            Object value = null;
            if (field.getType().equals(String.class)) {
                value = input.next();
            } else if (field.getType().equals(Integer.class)) {
                value = input.nextInt();
            } else if (field.getType().equals(Float.class)) {
                value = input.nextFloat();
            } else if (field.getType().equals(Double.class)) {
                value = input.nextDouble();
            } else if (field.getType().equals(Boolean.class)) {
                value = input.nextBoolean();
            }
            String  oldFirstChar = String.valueOf(fieldName.charAt(0));
            String setterName = "set" + fieldName.replaceFirst(oldFirstChar,oldFirstChar.toUpperCase());
//            System.out.println(setterName);

            Method method = clazz.getMethod(setterName,field.getType());
            method.invoke(t,value);
        }
    }

    public List<T> getPersonList() {
        return personList;
    }

    public void setPersonList(List<T> personList) {
        this.personList = personList;
    }
}