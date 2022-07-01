package baobao.LIANxi.Array.LianXi;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/31 12:22
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：MyDate.java
 * @Software：IntelliJ IDEA
 */
public class MyDate {
    private int year;
    private int month;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private int day;

}
