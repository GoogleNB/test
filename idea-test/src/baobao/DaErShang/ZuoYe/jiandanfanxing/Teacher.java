package baobao.DaErShang.ZuoYe.jiandanfanxing;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:43
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：asd.java
 * @Software：IntelliJ IDEA
 */
public class Teacher extends Person{
    private Integer teacherId;

    private String teachSubject;

    public Teacher() {
    }

    public Teacher(String name, String gender, Integer age, Integer teacherId, String teachSubject) {
        super(name, gender, age);
        this.teacherId = teacherId;
        this.teachSubject = teachSubject;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeachSubject() {
        return teachSubject;
    }

    public void setTeachSubject(String teachSubject) {
        this.teachSubject = teachSubject;
    }

    @Override
    public String toString() {
        return "Teacher{"+
                "teacherId=" + teacherId +
                ", 所教的科目是：'" + teachSubject + '\'' +
                '}';
    }
}
