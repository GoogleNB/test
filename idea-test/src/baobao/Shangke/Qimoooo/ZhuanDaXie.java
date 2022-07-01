package baobao.Shangke.Qimoooo;

import java.util.Scanner;

public class ZhuanDaXie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        char[] y = x.toCharArray();
        System.out.println("输入字母");
        for (int i = 0; i < y.length; i++) {
            if (y[i] >= 'A'&&y[i]<='Z') {
                y[i]+=32;
            }
            else y[i]-=32;
        }
        for (int i=0;i<y.length;i++) {
            System.out.print(y[i]+" ");
        }
    }
}
