package baobao.Shangke.Qimoooo;

import java.util.Scanner;

public class XingQi {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char x;
        System.out.println("输入字母");
        x = scan.next().charAt(0);
        switch (x) {
            case 'm':
                System.out.println("星期一");break;
            case 'w':
                System.out.println("星期三");break;
            case 'f':
                System.out.println("星期五");break;
        }
        if (x == 't' || x == 's') {
            System.out.println("输入第二个字母");
            x = scan.next().charAt(0);
            if (x == 'h') {
                System.out.println("星期四");
            }
            else if(x=='u') System.out.println("星期二");

             if (x == 'a') {
                System.out.println("星期六");
            }
            else if (x=='u')System.out.println("星期天");
        }
    }
}
