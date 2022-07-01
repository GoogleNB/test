package baobao.LIANxi.StringLianXi;

import java.util.Arrays;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/20 17:50
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：T5.java
 * @Software：IntelliJ IDEA
 */
public class T5 {
    public static void main(String[] args) {
        String s="asdfghjkl";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
       // s =chars;
        String s2 = new String(chars);
        System.out.println(s2);
//        for (char i:chars){
//            System.out.print(i+" ");
//        }

    }
}
