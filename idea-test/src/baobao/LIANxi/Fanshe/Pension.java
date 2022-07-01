package baobao.LIANxi.Fanshe;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/11/20 17:07
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Pension.java
 * @Software：IntelliJ IDEA
 */
public class Pension {
    private String name;
    private int old;

    @Override
    public String toString() {
        return "Pension{" +
                "name='" + name + '\'' +
                ", old=" + old +
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

    public Pension(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public Pension() {
    }
}
