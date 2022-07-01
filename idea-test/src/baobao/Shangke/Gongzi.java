package baobao.Shangke;
import java.util.Scanner;
public class Gongzi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      if (x<60)
        System.out.println("差");
      else if(x>=60&&x<70)
          System.out.println("中");
      else if(x>=70&&x<80)
          System.out.println("良");
      else
          System.out.println("优");


    }
}
