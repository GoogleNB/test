package baobao.LIANxi.chouXiang;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/12 21:46
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：MaiPiaoXC.java
 * @Software：IntelliJ IDEA
 */
public class MaiPiaoXC implements Runnable{
private int packt=100;
    @Override
    public void  run() {
        while (true) {
            synchronized (this) {
                notify();

            if (this.packt >= 0) {


                System.out.println(Thread.currentThread().getName()+"剩余票数"+packt);
                packt--;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else break;
            }
        }
    }


}
