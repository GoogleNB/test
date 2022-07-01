package baobao.LIANxi.Array.LianXi;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/31 12:24
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Employee.java
 * @Software：IntelliJ IDEA
 */
public class Employee  implements Comparable {
    private String name;
    private int old;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee() {
    }

    public Employee(String name, int old, MyDate birthday) {
        this.name = name;
        this.old = old;
        this.birthday = birthday;
    }

    private MyDate birthday;

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        }
//        return 0;
        throw new RuntimeException("传入的数据不对");
    }
}
