package baobao.DaErShang.ZuoYe.zhujie;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:55
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：sad.java
 * @Software：IntelliJ IDEA
 */
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 *
 * 负责提示录入人员的相关属性，提示必须是注解@Label所标注的中文名称。
 *
 * @author wendi
 *
 */
public class PersonInput2 implements PersonAction {
    @Override
    public Person process(Person person) {
        Class clazz = person.getClass();

        Field[] fields = clazz.getDeclaredFields();

        Scanner can = new Scanner(System.in);

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object obj = field.get(person);
                if (obj == null) {
                    String str = field.getAnnotation(Label.class).value();
                    System.out.println("请输入" + str + ":");
                    String str1 = can.next();
                    // field.set(person, str1);
                    // java.lang.Integer
                    if (field.getType().getName().contains("Integer")) {
                        field.set(person, Integer.parseInt(str1));
                    }
                    if (field.getType().getName().contains("Boolean")) {
                        field.set(person, Boolean.parseBoolean(str1));
                        // field.set(person, Boolean.valueOf(str1));

                    }
                    if (field.getType().getName().contains("String")) {
                        field.set(person, str1);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return person;
    }
}

