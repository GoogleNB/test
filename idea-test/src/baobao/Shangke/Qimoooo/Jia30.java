package baobao.Shangke.Qimoooo;

import org.junit.Test;

public class Jia30 {

//
//    public static void main(String[] args) {
//        int j, i;
//        for (i = 1; i <= 20; i++) {
//            for (j = 1; j <= 20 && i != j; j++) {
//                if ((i + j) > 30) {
//                    System.out.println("第一" + i + "第二" + j);
//                }
//            }
//        }
//    }
@Test
    public void jia() {
    double ff=2.35f;
        int x=1;
        int sum=0;
        for (; x < 20; x++) {
            sum+=x;
            if (sum > 30) {
                System.out.println("当前数是"+x);
                System.out.println(sum);
                break;
            }
        }
    }


}
