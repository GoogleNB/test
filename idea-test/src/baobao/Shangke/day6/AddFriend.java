package baobao.Shangke.day6;

import java.util.Scanner;

public class AddFriend {
    public static void main(String[] args) {
        System.out.println("-----------------------------配置：                <Default>---------------");
        Scanner scan= new Scanner(System.in);
        Friend pp=new Friend();
        System.out.println("请输入新的联系人姓名：");
        pp.frename=scan.next();
        System.out.println("请输入新的联系人邮箱：");
        pp.freEmail=scan.next();
        System.out.println("请输入新的联系人电话：");
        pp.frePhone=scan.next();
        System.out.println("请输入新的联系人地址：");
        pp.freComp=scan.next();
        System.out.println("信息录入成功");
        System.out.println(pp.toString());
        System.out.println("处理已完成");
    }
}
