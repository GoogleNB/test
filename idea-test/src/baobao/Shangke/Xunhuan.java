package baobao.Shangke;
import java.util.Scanner;
public class Xunhuan {
//    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("练得怎么样");
//        String s=input.next();
//        while (s.equals("no")){
//            System.out.println("联系联系");
//            System.out.println("练的怎么样");
//            s=input.next();
//        }
//        System.out.println("牛逼牛逼");
//    }


//    public static void main(String[] args) {
//        int i, j;
//        for (i = 1; i <= 9; i++) {
//            for (j = 1; j <= i; j++) {
//                if (i>4)break;
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//public static void main(String[] args) {
//    int x=1;
//    while (x<=4){
//        System.out.println("x="+x);
//        if (x==3) break;
//        x++;
//    }

public static void main(String[] args) {
    int sum=0;
    Scanner S=new Scanner(System.in);
    int x=S.nextInt();
    for (int i=1;i<=x;i++){
        if (i%2!=0){
            continue;
    }
        sum+=i;
}
    System.out.println(sum);
}
}
