package baobao.kaoshi;

import java.io.*;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 22:05
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：IoCopy.java
 * @Software：IntelliJ IDEA
 */
public class IoCopy {
    public static void main(String[] args) {

        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(""));
            out = new BufferedOutputStream(new FileOutputStream(""));
            byte[] a = new byte[1024];
            int len;
            while ((len = in.read(a)) != -1) {

                out.write(a, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }


        }
    }


}
