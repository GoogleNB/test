package baobao.Shangke;
import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        int book=12,q=1,x=2,k=3,l=5;
        int sh,number,z=20,no;
        Scanner s=new Scanner(System.in);
        System.out.println("书本的价格为"+ book+"，内总共有"+z+"元");
        System.out.println("1.铅笔的价格为"+q+"元");
        System.out.println("2.橡皮的价格为"+x+"元");
        System.out.println("3.可乐的价格为"+k+"元");
        System.out.println("4.零食的价格为"+l+"元");
        System.out.println("请输入购买产品序列号：");
        no=s.nextInt();
        switch (no){
            case 1:number=(z-book)/1;sh=(z-book)%1;
            System.out.println("购买完书本后还可以购买铅笔"+number+"个，还剩"+sh+"元");break;
            case 2:number=(z-book)/2;sh=(z-book)%2;
            System.out.println("购买完书本后还可以购买橡皮"+number+"个，还剩"+sh+"元");break;
            case 3:number=(z-book)/3;sh=(z-book)%3;
            System.out.println("购买完书本后还可以购买可乐"+number+"个，还剩"+sh+"元");break;
            case 4:number=(z-book)/5;sh=(z-book)%5;
            System.out.println("购买完书本后还可以购买零食"+number+"个，还剩"+sh+"元");break;
            default:
                System.out.println("买你🐎");
        }

    }
}
