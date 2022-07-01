package baobao.DaErShang.ZuoYe.kaoshixitong.yichang;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/17 12:14
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：AgeException.java
 * @Software：IntelliJ IDEA
 */
public class AgeException extends Exception {
    String message;

    AgeException(String name, int m) {
        message = name + "的年龄是" + m + "不正确";
    }

    @Override
    public String toString() {
        return message;
    }
}
