package baobao.DaErShang.ZuoYe.zhijiaokecheng;

import java.util.Random;
import java.util.Scanner;


/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/12 21:12
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：ZFD.java
 * @Software：IntelliJ IDEA
 */
public class ZFD {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
   private  int a = random.nextInt(100);
    public void cai() {
        System.out.println("输入一个数");
        int s = 0;
        while (s!=a) {
            s = scan.nextInt();
            if (s > a) {
                System.out.println("猜大了");
            }
            else System.out.println("猜小了");

        }
        System.out.println("恭喜你，猜到了");
}





    public static void main(String[] args) {
        ZFD zfd = new ZFD();
        zfd.cai();
    }
}
