package baobao.DaErShang.ZuoYe.jiandanfanxing;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:42
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：sc.java
 * @Software：IntelliJ IDEA
 */
public class Student extends Person{
    private Integer stuId;

    private Integer classId;

    private String profession;

    public Student() {
    }

    public Student(String name, String gender, Integer age, Integer stuId, Integer classId, String profession) {
        super(name, gender, age);
        this.stuId = stuId;
        this.classId = classId;
        this.profession = profession;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", classId=" + classId +
                ", profession='" + profession + '\'' +
                '}';
    }
}