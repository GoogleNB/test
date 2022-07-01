package baobao.LIANxi.StringLianXi;

/**
 * -*- coding = utf-8 -*-
 *获取两个字符串中的最大相同字串
 * @Time: 2021/10/20 17:31
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：T4.java
 * @Software：IntelliJ IDEA
 */
public class T4 {
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() > str2.length()) ? str1 : str2;
            String minStr = (str1.length() > str2.length()) ? str2 : str1;

            int len = minStr.length();

            for (int i = 0; i < len; i++) {// 0 1 2 3 4 此层循环决定要去几个字符

                for (int x = 0, y = len - i; y <= len; x++, y++) {

                    if (maxStr.contains(minStr.substring(x, y))) {

                        return minStr.substring(x, y);
                    }

                }

            }
        }
        return null;
    }
    public static void main(String[] args) {
        String s1 = "苟利国家生死以";
        String s2 = "生死有命，富贵在天";
        T4 t4 = new T4();
        System.out.println(t4.getMaxSameSubString(s1, s2));
    }
}
