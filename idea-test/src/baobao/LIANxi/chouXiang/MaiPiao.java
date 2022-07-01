package baobao.LIANxi.chouXiang;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/12 21:43
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：MaiPiao.java
 * @Software：IntelliJ IDEA
 */

public class MaiPiao {
    public static void main(String[] args) {
        MaiPiaoXC m1 = new MaiPiaoXC();
        Thread thread1 = new Thread(m1);
        thread1.setName("线程1");
        Thread thread2 = new Thread(m1);
        thread2.setName("线程2");
        Thread thread3 = new Thread(m1);
        thread3.setName("线程3");
        thread1.start();
        thread2.start();
        thread3.start();





    }
}
