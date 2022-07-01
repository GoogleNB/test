package baobao.LIANxi;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/16 18:41
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：BF算法求相同字串.java
 * @Software：IntelliJ IDEA
 */
public class BF算法求相同字串 {
    public static void main(String[] args) {
        String a = "aaaaab";
        String b = "aab";
        int i=0,j=0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;i++;
            }
            else {
                i = i - j + 2;
                j = 1;
            }
        }
        if (j >= b.length()) {
            System.out.println("成功"+(i-b.length()));
        }else
            System.out.println("失败");
    }
}
