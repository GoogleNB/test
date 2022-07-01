package baobao.Shangke;
import java.util.Scanner;
public class Average {
//    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        int x,i=1;
//        double sum=0,y;
//        System.out.println("请输入人数：");
//        x=input.nextInt();
//        while (i<=x){
//            System.out.println("请输入第"+i+"个成绩");
//            y=input.nextDouble();
//            sum+=y;
//            i++;
//        }
//        sum/=x;
//        System.out.println("平均分是"+sum);
//    }
//public static void main(String[] args) {
////    Scanner input =new Scanner(System.in);
////    double number =80000,year=0,i=0.25;
////    while (number<200000){
////        number=number+number*i;
////        System.out.println(number);
////        year++;
////    }
////    System.out.println("第"+(year+2006));
////}
//public static void main(String[] args) {
//    //求阶乘
//    Scanner input =new Scanner(System.in);
//    int x,sum=1,i=1;
//    System.out.println("输入数");
//    x=input.nextInt();
//    while (i<=x){
//        sum*=i;
//        i++;
//    }
//    System.out.println(sum);
//}
public static void main(String[] args) {
    //求负数和和数量
    int x,sum=0,num=0,i=0;
    Scanner input =new Scanner(System.in);
    while (i<10){
        x=input.nextInt();
        if (x<0)
        {sum+=x;
        num++;
        }
        i++;
    }
    System.out.println(sum+" "+num);
}
}
