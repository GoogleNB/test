package baobao.kaoshi.cunqian;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/24 9:44
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Main.java
 * @Software：IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) {
        Zhuanghu zhuanghu = new Zhuanghu();
        Thread thread = new Thread(new ATM(zhuanghu, "1", 100));
        Thread thread1 = new Thread(new ATM(zhuanghu, "2", 200));
        System.out.println("当前帐户余额为:" + zhuanghu.getMoney());
        thread.start();
        thread1.start();
    }
}
