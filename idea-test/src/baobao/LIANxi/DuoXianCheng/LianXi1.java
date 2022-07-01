package baobao.LIANxi.DuoXianCheng;

import org.junit.Test;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/8 16:34
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：LianXi1.java
 * @Software：IntelliJ IDEA
 */
public class LianXi1 {

    @Test
    public void rr() {
        String aaa = "..\\images\\face\\Image1.gif";
        aaa = aaa.replace("\\", "\\\\");
        System.out.println(aaa);
        "qq".equals("qq");
    }

    public static void main(String[] args) {


//        LianXi2 lianXi2 = new LianXi2();
//        LianXi3 lianXi3 = new LianXi3();
//
//        lianXi3.start();
//        lianXi2.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
            }
        }.start();
    }
}

class LianXi2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

class LianXi3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
