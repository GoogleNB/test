package baobao.Shangke.Qimoooo;

import java.util.Scanner;

public class BuXiangXie {
    String m;
    String h;
    String z;
    Scanner scan = new Scanner(System.in);

    public String getinfo() {
        return "信息"+m+h+z;
    }
    public  void  input() {
        System.out.println("输入书名作者和编号");
        m = scan.next();
        h = scan.next();
        z = scan.next();
    }

}
