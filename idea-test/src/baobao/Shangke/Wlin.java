package baobao.Shangke;
import java.util.Scanner;
public class Wlin {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x;
        System.out.println("请输入内容");
        x=scan.nextInt();
        if(x==1)
            System.out.println("武林");
        else if(x==2)
            System.out.println("武当");
        else if(x==3)
            System.out.println("峨眉");
        else
            System.out.println("逐出师门");
    }
}
