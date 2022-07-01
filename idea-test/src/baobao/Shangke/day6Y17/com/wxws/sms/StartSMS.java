package baobao.Shangke.day6Y17.com.wxws.sms;

import java.util.Scanner;

public class StartSMS {


    public static void main(String[] args) {
        Manager manager = new Manager();
        ShowMainMenu showMainMenu = new ShowMainMenu();
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        System.out.println("输入账号和密码");
        String acct = scan.next();
        String pass = scan.next();
        if (manager.getName().equals(acct) && manager.getPassWord().equals(pass)) {

            while (isFlag) {
                System.out.println("****************客户信息管理软件*************************");
                System.out.println("1.显示菜单登录");
                System.out.println("2.真情回馈");
                System.out.println("3.大抽奖");
                System.out.println("4.信息管理");
                System.out.println("0.退出系统");
                System.out.println("请选择0-4：");
                int x = scan.nextInt();
                for (; ; ) {


                    if (x != 1 && x != 2 && x != 3 && x != 4 && x != 0) {
                        System.out.println("输入错误，请重新输入：");
                        x = scan.nextInt();
                    } else break;
                }
                switch (x) {
                    case 1:
                        showMainMenu.show1();
                        break;
                    case 2:
                        showMainMenu.show2();
                        break;
                    case 3:
                        showMainMenu.show3();
                        break;
                    case 4:
                        showMainMenu.show4();
                        break;
                    case 0:
                        isFlag = false;
                }

            }
        } else System.out.println("没有权限进入系统");
    }
}
