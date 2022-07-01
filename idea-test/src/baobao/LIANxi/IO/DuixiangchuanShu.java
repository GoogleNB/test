package baobao.LIANxi.IO;

import java.io.*;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/20 15:57
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：DuixiangchuanShu.java
 * @Software：IntelliJ IDEA
 */
public class DuixiangchuanShu  {
    public static void main(String[] args) throws Exception {
        Person person = new Person("空洞骑士",18);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\java_Lianxi\\idea-test\\src\\baobao\\LIANxi\\IO\\ss.txt"));
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\java_Lianxi\\idea-test\\src\\baobao\\LIANxi\\IO\\ss.txt"));
        Person p1 =(Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(p1.toString());
    }
}
