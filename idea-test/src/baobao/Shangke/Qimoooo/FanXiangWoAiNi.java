package baobao.Shangke.Qimoooo;

import java.util.Scanner;

public class FanXiangWoAiNi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] x = new char[5];
//        for (int i = 0; i < x.length; i++) {  //一个一个输
//            x[i] = scan.next().charAt(0);
//        }
        String c = scan.next();//一起输
        x = c.toCharArray();
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i]);
        }
    }
}
