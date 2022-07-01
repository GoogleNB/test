package baobao.DaErShang.ZuoYe.zhujie;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:56
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：asd.java
 * @Software：IntelliJ IDEA
 */

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();

//		person.setAge(18);
//		person.setIdNo("1234567890");
//		person.setIsMerried(true);
//		person.setName("小马");
//		person.setSex("男");


        PersonInput2 input=new PersonInput2();
        input.process(person);

        PersonDisplay display=new PersonDisplay();
        display.process(person);

    }
}
