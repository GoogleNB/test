package baobao.Shangke.Qimoooo;


import org.junit.Test;

import java.util.Scanner;

public class ShenFenZheng {
    @Test
    public void ss() {
        Scanner scan = new Scanner(System.in);
//    String x = "371325200103140000";
//    System.out.println(x.substring(6,14));
    }

    public void ids() {

        int[] a = new int[]{112, 105, 26, 89, 33, 27};
        int falg=0;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (a[i] == 20) {
                falg++;
            }
        }
        if (falg > 0) {
            System.out.println("有积分等于20的");
        }

    }
@Test
    public void pai() {
            char t;
        char[] a = new char[]{'a', 'c', 'u', 'b', 'e','f','c'};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
@Test
    public void qi() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 != 0 &&i/10!=7) {
                System.out.println(i);
            }
        }
    }
@Test
    public  void cunqian() {
        float sum=1;int i=1;
    while (sum <= 10) {
        sum*=1.5;
        i++;
    }
    System.out.println(i);
    }


}
