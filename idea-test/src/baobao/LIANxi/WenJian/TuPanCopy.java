package baobao.LIANxi.WenJian;

import java.io.*;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/11/12 15:47
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：TuPanCopy.java
 * @Software：IntelliJ IDEA
 */
public class TuPanCopy {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        Test();
        long end= System.currentTimeMillis();
        System.out.println(end-begin);
    }
    public static void Test()  {
        BufferedInputStream ru = null;
        BufferedOutputStream chu = null;
        try {
            ru = new BufferedInputStream(new FileInputStream("D:\\java_Lianxi\\idea-test\\src\\baobao\\LIANxi\\WenJian\\h1.png"));
            chu = new BufferedOutputStream(new FileOutputStream("D:\\java_Lianxi\\idea-test\\src\\baobao\\LIANxi\\WenJian\\h2.png"));
            int len;
            byte[] a = new byte[1024];
            while ((len = ru.read(a)) != -1) {
                chu.write(a,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ru != null) {
                try {
                    ru.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (chu != null) {
                try {
                    chu.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
