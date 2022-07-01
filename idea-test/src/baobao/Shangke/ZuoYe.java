package baobao.Shangke;

import java.util.Random;
import java.util.Scanner;

public class ZuoYe {

    public static void main(String[] args) {
        String[] name = new String[3];
        input(name);
        printx(name);
        chou(name);
    }

    public static void input(String[] name) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入用户姓名：");
        for (int i = 0; i < name.length; i++) {
            name[i] = scan.next();
        }
    }

    public static void printx(String[] name) {
        System.out.println("用户分别有");
        for (int i = 0; i < name.length; i++)
            System.out.print(name[i] + " ");
    }

    public static void chou(String[] name) {
        Random rdm = new Random();
        System.out.println();
        System.out.println("幸运用户是：" + name[rdm.nextInt(3)]);
    }
}
