//package baobao.Shangke;
package xx;
public class Sushu {
//    final double PI=3.1415926
    public static void main(String[] args) {//求素数
        int a[][];
        int i,k,n=0;
        for (i=1;i<=100;i+=1)
        {   int flag=1;
            for (k=2;k<i;k++){
                if(i%k==0) {
                    flag=0;
            }
        }
            if(flag==1){
                System.out.print(i+" ");n++;
                if(n%10==0) System.out.print("\n");
            }
        }
    }

     void sort(int x) {
       int i=3,j=2;
         while (--i != i / j) {
             i+=2;
         }
    }


//public static void main(String[] args) {//玫瑰花数
//    int a,b,c,d;
//    for(int i=1000;i<=9999;i++){
//        a=i/1000;
//        b=i/100%10;
//        c=i/10%10;
//        d=i%10;
//        if (i==a*a*a*a+b*b*b*b+c*c*c*c+d*d*d*d)
//            System.out.println(i);
//    }
//}
}
