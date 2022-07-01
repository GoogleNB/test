package baobao.DaErShang.ZuoYe.zhijiaokecheng;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/12 20:55
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：XiaoXueSheng.java
 * @Software：IntelliJ IDEA
 */
public class XiaoXueSheng extends Student {
    private String banji;
    public void eat() {
        System.out.println("小学生需要玩游戏");
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public void sleep() {
        System.out.println("小学生需要睡觉");
    }
}
