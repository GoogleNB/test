package baobao.DaErShang.ZuoYe.zhijiaokecheng;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/10 14:27
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Teacher.java
 * @Software：IntelliJ IDEA
 */
public class Teacher {
    private String name;
    private String kecheng;
    private String zhiwei;

    public void shangke() {
        System.out.println("老师需要上课");
    }
    public void keyan() {
        System.out.println("老师需要搞科研");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
    }

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }
}
