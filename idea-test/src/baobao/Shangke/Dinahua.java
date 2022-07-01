package baobao.Shangke;
import java.util.Scanner;
public class Dinahua {
    public static void main(String[] args) {
        double x,y,s;
        Scanner sacn =new Scanner(System.in);
        System.out.println("输入体重 KG");
        x=sacn.nextDouble();
        System.out.println("输入身高 m");
        y=sacn.nextDouble();
        s=x/(y*y);
        if (s > 40) {
            System.out.println("重度肥胖");
        } else if (s >=35) {
            System.out.println("中度肥胖");
        } else if (s >= 30) {
            System.out.println("轻度肥胖");
        } else if (s >=25) {
            System.out.println("超重");
        } else if(s>=18.5){
            System.out.println("正常");
        }
        else if(x>0)
            System.out.println("偏瘦");
        else
            System.out.println("非人哉！");

    }
}
