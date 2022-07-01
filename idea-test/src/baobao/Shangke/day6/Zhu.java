package baobao.Shangke.day6;

import java.util.Scanner;

public class Zhu {


    //    public static void main(String[] args) {
//        Day6y7 manager = new Day6y7();
//        Scanner scan = new Scanner(System.in);
//        manager.name = "as";
//        manager.password = "123";
//        System.out.println("输入旧的用户名和密码");
//        if (manager.name.equals(scan.next()) & manager.password.equals(scan.next())) {
//            System.out.println("输入新的用户名和密码");
//            manager.name = scan.next();
//            manager.password = scan.next();
//
//        } else
//            System.out.println("验证失败");
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Day6y7 customer = new Day6y7();
        while (true) {
            System.out.println("输入会员号和积分");
            customer.number = scan.next();
            customer.jifen = scan.nextInt();
            if (customer.jifen >= 8000 && customer.jifen < 15000) {
                LiPing gift = new LiPing();
                gift.name = "大礼包";
                gift.price = 122;
                System.out.println(gift.printxx());
            } else if (customer.jifen >= 15000) {
                LiPing notebook = new LiPing();
                notebook.name = "笔记本";
                notebook.price = 100000;
                System.out.println(notebook.printxx());
            } else System.out.println("积分不足");
            System.out.println("是否继续 不继续输n");
            if (scan.next().equals("n")) break;
        }
    }
}
