package baobao.Shangke;
import java.util.Scanner;
public class jishuhe {
//    public static void main(String[] args) {
//        int x=1,sum=0;
//        do{
//            sum+=x;
//            x+=2;
//        }while (x<=999);
//        System.out.println(sum);
//    }
//public static void main(String[] args) {
//    int i=1,sum=0,n;
//    Scanner s=new Scanner(System.in);
//    n=s.nextInt();
//    if(n>=0){
//    while (i<=n){
//        if(i%2==0)sum+=i;
//        i++;
//    }
//    }
//    else {
//        while (n<=i){
//            if(i%2==0)sum+=i;
//            i--;
//    }
//    }
//    System.out.println(sum);
public static void main(String[] args) {
    int sum=0;
    Scanner s =new Scanner(System.in);
    int n=s.nextInt();
    for(int i=0;i<n;i+=2)
        sum+=i;
    System.out.println(sum);
}
}

