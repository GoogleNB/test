package baobao.kaoshi.cunqian;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/24 9:45
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：ATM.java
 * @Software：IntelliJ IDEA
 */
public class ATM implements Runnable{
    Zhuanghu card;
    String name;

    public ATM(Zhuanghu card, String name, int money) {
        this.card = card;
        this.name = name;
        this.money = money;
    }

    int money;
    @Override
    public void run() {
        card.save(money);
        System.out.println(name+"存了"+money+"现在有"+card.getMoney());
    }
}
