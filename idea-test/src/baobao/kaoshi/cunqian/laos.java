package baobao.kaoshi.cunqian;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/24 10:17
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：laos.java
 * @Software：IntelliJ IDEA
 */
public class laos {
    public static void main(String[] args) {
        BankAccount visacard = new BankAccount();
        ATM1 丈夫 = new ATM1("丈夫", visacard, 200);
        ATM1 妻子 = new ATM1("妻子", visacard, 300);
        Thread t1 = new Thread(丈夫);
        Thread t2 = new Thread(妻子);
        System.out.println("当前帐户余额为:" + visacard.getmoney());
        t1.start();
        t2.start();
    }
}

class ATM1 implements Runnable { // 模拟ATM机或柜台存钱
    BankAccount card;
    String name;
    long m;

    ATM1(String n, BankAccount card, long m) {
        this.name = n;
        this.card = card;
        this.m = m;
    }

    public void run() {
        card.save(name, m); // 调用方法存钱
        System.out.println(name + "存入 " + m + " 后，帐户余额为 " + card.getmoney());
    }
}

class BankAccount {
   static long money = 0; // 设置帐户中的初始金额

    public void save(String s, long m) { // 存錢
// public synchronized void save(String s, long m){
        System.out.println(s + "存入 " + m);
        long tmpe = money;
        try { // 模拟存钱所花费的时间
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        money = tmpe + m; // 相加之后存回帐户
    }

    public long getmoney() { // 获得当前帐户余额
        return money;
    }
}
