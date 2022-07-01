package baobao.Shangke.Qimoooo;

import java.util.Scanner;

public class NM {
    public static void main(String[] args) {
        String[] x = new String[10];
        String B = "ss";
        B.toCharArray();
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < x.length; i++) {
            x[i] = scanner.next();
            if (x[i].equals("b")) {
                break;
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.println(x[j]);
        }
    }
}
