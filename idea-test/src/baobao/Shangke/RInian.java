package baobao.Shangke;
import java.util.Scanner;
public class RInian {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        if ((x % 4 == 0 & x % 100 != 0) | x % 400 == 0){
         System.out.println(x+"是闰年");}
        else{
            System.out.println(x+"不是闰年");}
    }
}
