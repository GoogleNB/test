package baobao.LIANxi.Array.LianXi;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/31 12:27
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：EmployeeTest.java
 * @Software：IntelliJ IDEA
 */
public class EmployeeTest {
    //使用自然排序
    @Test
    public void Test() {

        Employee m1 = new Employee("空置率这", 18, new MyDate(1999, 2, 5));
        Employee m2 = new Employee("雷之虑者", 19, new MyDate(1996, 2, 5));
        Employee m3 = new Employee("离职率这", 20, new MyDate(1997, 2, 5));
        Employee m4 = new Employee("因言之虑者", 21, new MyDate(1998, 2, 5));
        TreeSet set = new TreeSet();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Employee m1 = new Employee("空置率这", 18, new MyDate(1999, 2, 5));
        Employee m2 = new Employee("雷之虑者", 19, new MyDate(1996, 2, 5));
        Employee m3 = new Employee("离职率这", 20, new MyDate(1997, 2, 5));
        Employee m4 = new Employee("因言之虑者", 21, new MyDate(1998, 2, 5));
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                    int minusYear = b1.getYear() - b2.getYear();
                    if (minusYear != 0) {
                        return minusYear;
                    }
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if (minusMonth != 0) {
                        return minusMonth;
                    }
                    return b1.getDay() - b2.getDay();
                }

                throw new RuntimeException("类型不匹配");
            }
        });
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
