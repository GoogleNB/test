package baobao.DaErShang.ZuoYe.zhujie;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:55
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：asd.java
 * @Software：IntelliJ IDEA
 */
import java.lang.reflect.Field;

/**
 * 负责显示人员信息，显示时的属性名称必须为注解@Label所标注的中文名称。
 *
 * @author wendi
 *
 */
public class PersonDisplay implements PersonAction {

    @Override
    public Person process(Person person) {
        Class clazz = person.getClass();
        Field[] field = clazz.getDeclaredFields();

        for (Field field2 : field) {

            // 获取属性的Label注解的value参数值
            if (field2.isAnnotationPresent(Label.class)) {
                String nameField = field2.getAnnotation(Label.class).value();
                System.out.print(nameField + ":");
            }

            // 获得属性的具体值
            try {
                field2.setAccessible(true);
                Object value = field2.get(person);
                System.out.println(value);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return person;
    }
}
