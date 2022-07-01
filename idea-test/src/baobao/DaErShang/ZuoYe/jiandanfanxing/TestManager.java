package baobao.DaErShang.ZuoYe.jiandanfanxing;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:43
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：dsa.java
 * @Software：IntelliJ IDEA
 */
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;

public class TestManager {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        PersonManager<Person> personPersonManager = new PersonManager<>();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("1.对教师进行管理");
            System.out.println("2.对学生进行管理");
            System.out.println("3.退出管理界面");
            System.out.print("请输入您的选择:");

            int choice = input.nextInt();
            if (choice == 1){
                while(true){
                    System.out.print(
                            "1.添加教师\n" +
                                    "2.删除教师\n" +
                                    "3.根据教师号查找老师\n" +
                                    "4.查找所有教师\n" +
                                    "5.退出\n" + "请选择您要进行的操作：");
                    int choose = input.nextInt();
                    if (choose == 5){
                        break;
                    }
                    switch (choose){
                        case 1:
                            Teacher teacher = new Teacher();
                            personPersonManager.add(teacher);
                            break;
                        case 2:
                            Teacher teacher1 = new Teacher();
                            personPersonManager.remove(teacher1);
                            break;
                        case 3:
                            System.out.print("请输入教师号:");
                            int id = input.nextInt();
                            Teacher byId = (Teacher) personPersonManager.findById(id);
                            System.out.println(byId);
                            break;
                        case 4:
                            List<Person> list = personPersonManager.findAll(1);
                            if (list.size() != 0){
                                for (int i = 0; i < list.size(); i++) {
                                    Teacher teacher2 = (Teacher)list.get(i);
                                    System.out.println(teacher2.toString());
                                }
                            }else{
                                System.out.println("没有教师存在！");
                            }
                            break;
                    }
                }
            }
            if (choice == 2){
                while(true){
                    System.out.print(
                            "1.添加学生\n" +
                                    "2.删除学生\n" +
                                    "3.根据学生号查找学生\n" +
                                    "4.查找所有学生\n" +
                                    "5.退出\n" +
                                    "请选择您要进行的操作:");
                    int choose = input.nextInt();
                    if (choose == 5){
                        break;
                    }
                    switch (choose){
                        case 1:
                            Student student = new Student();
                            personPersonManager.add(student);
                            break;
                        case 2:
                            Student student1 = new Student();
                            personPersonManager.remove(student1);
                            break;
                        case 3:
                            System.out.print("请输入学号:");
                            int id = input.nextInt();
                            Student byId = (Student) personPersonManager.findById(id);
                            System.out.println(byId);
                            break;
                        case 4:
                            List<Person> list = personPersonManager.findAll(2);
                            if (list.size() != 0){
                                for (int i = 0; i < list.size(); i++) {
                                    Student student2 = (Student) list.get(i);
                                    System.out.println(student2.toString());
                                }
                            }else{
                                System.out.println("没有学生存在！");
                            }
                            break;
                    }
                }
            }
            if (choice == 3){
                break;
            }
        }
    }

}