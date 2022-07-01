package baobao.Shangke;
import java.util.Scanner;
public class Todeng {
    public static void main(String[] args) {
        int month,cang;
        double jia=4000;
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入月份");
        month=scan.nextInt();
        System.out.println("请输入仓位 1为头等,2为经济");
        cang=scan.nextInt();
        if(month>=5&month<=10)
        {
            if(cang==1)
                System.out.println("票价为"+jia*0.9);
            else
                System.out.println("票价为"+jia*0.7);
        }
        else {
            if(cang==1)
                System.out.println("票价为"+jia*0.6);
            else
                System.out.println("票价"+jia*0.3);
        }
    }
}
