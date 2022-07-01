package baobao.Shangke;
import java.util.Scanner;
public class Eti {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        double x;
        x=scan.nextInt();
        int y;
        y= (int) ((x*10+5)/2+3.14159);
        System.out.println("y="+y);
    }
}
