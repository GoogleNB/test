package baobao.kaoshi.cunqian;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/24 9:45
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Zhuanghu.java
 * @Software：IntelliJ IDEA
 */
public class Zhuanghu {
    int money=0;

    public synchronized   void save(int a) {
        System.out.println("存入"+a);
        int tmpe = money;
        try { // 模拟存钱所花费的时间
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        money = tmpe + a;
    }

    public int getMoney() {
        return money;
    }
}
