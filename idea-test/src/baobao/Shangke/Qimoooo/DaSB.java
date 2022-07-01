package baobao.Shangke.Qimoooo;

import java.util.Scanner;

public class DaSB {


    public static void main(String[] ages) {
        int flag=1;

        System.out.println("循环输入:");
        Scanner a = new Scanner(System.in);
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = a.nextInt();
        }
        for ( int  i = 0; i < 5; i++) {
            if (x[i] < 0) {
                System.out.println("fu");
                flag=0;
                break;
            }
        }
        if (flag==1)
        System.out.println("chou");
    }



}
