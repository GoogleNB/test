package baobao.LIANxi.StringLianXi;

/**
 * -*- coding = utf-8 -*-
 *1.模拟一个trim方法，去除字符串两端的空格。
 * @Time:2021/10/17 18:23
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：t1.java
 * @Software：IntelliJ IDEA
 */
public class t1 {
    public static void main(String[] args) {
        int start=0;
        int end=0;
        String s = " jks  ";
        int j=0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == ' '&&s.charAt(i+1)!=' ') {
                j=i;
                break;
            }
        }
        for (int i = s.length()-1; i >0 ; i--) {
            if (s.charAt(i) == ' '&&s.charAt(i-1)!=' ') {
                end=i;
                break;
            }
        }
        String substring = s.substring(j + 1, end);
        System.out.println(substring);
    }
}

