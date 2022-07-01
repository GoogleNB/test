package baobao.LIANxi.Array.LianXi;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/11/2 18:57
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：T1.java
 * @Software：IntelliJ IDEA
 */
public class T1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }

        a.sort(Comparator.reverseOrder());
        for (Object k :
                a) {
            System.out.println(k);
        }

    }
}
