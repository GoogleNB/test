package baobao.LIANxi.StringLianXi;

/**
 * -*- coding = utf-8 -*-
 *获取一个字符串在另一个字符串中出现的次数
 * @Time:2021/10/20 16:40
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：T3.java
 * @Software：IntelliJ IDEA
 */
public class T3 {


    public static void main(String[] args) {
        String s1 = "asdabdddadaaa";
        String s2 = "da";
        int n=0,x=0,j=0;
        //n是出现的次数，x是匹配相符的个数，j是匹配的下标,注：x和j可以用一个变量，为了以后看，故不省
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==s2.charAt(j)){
                x++;
                j++;
            }else {
                x=0;
                j=0;
            }
            if (x==s2.length()){
                x=0;
                j=0;
                n++;
            }
        }
        System.out.println(n);
    }
}
