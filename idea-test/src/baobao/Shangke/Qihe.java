package baobao.Shangke;
import java.util.*;
public class Qihe {
    public static void main(String[] args) {
        int x,sum,a,b,c,d;
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();
        a=x/1000;
        b=x/100%10;
        c=x/10%10;
        d=x%10;
        sum=a+b+c+d;
        System.out.println(sum);
    }
}
