package baobao.LIANxi.XiTi;

public class QiuWanShu {
    public static void main(String[] args) {
        int s,i,a;
        for (a = 2; a < 1000; a++) {
            s = 0;
            for (i = 1; i < a; i++) {

                if ((a % i) == 0) {
                    s += i;
                }
            }
            if (s == a) {
                System.out.println(a+"这是一个完数");
                System.out.print("他的因子有：");
            for (i = 1; i < a; i++) {
                if (a%i==0)
                    System.out.print(i+" ");
            }
                System.out.println("\n");
            }



        }
    }
}
