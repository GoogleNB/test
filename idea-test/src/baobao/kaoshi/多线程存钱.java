package baobao.kaoshi;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/24 8:57
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：多线程存钱.java
 * @Software：IntelliJ IDEA
 */
public class 多线程存钱 {


    public static void main(String[] args) {

        Thread thread = new Thread(new ATM("1", 100));
        Thread thread1 = new Thread(new ATM("2", 100));
        thread.start();
        thread1.start();
    }
    static class zhuanghu {
        static int money=0;

        public static void seve(String name, int m) {
            System.out.println(name+"cun"+m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money +=m ;

        }

        public static int getMoney() {
            return money;
        }
    }

    static class ATM implements Runnable {
        String name;
        int money;

        public ATM(String name, int money) {
            this.name = name;
            this.money = money;
        }

        @Override
        public void run() {

            zhuanghu.seve(name,money);
            System.out.println(name+"存入后"+zhuanghu.getMoney());
        }
    }
}
