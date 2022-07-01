package baobao.kaoshi;

import java.io.*;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/15 16:20
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：CharCopy.java
 * @Software：IntelliJ IDEA
 */
public class CharCopy  {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("D:\\java_Lianxi\\idea-test\\src\\baobao\\kaoshi\\hh.txt");
            fileWriter = new FileWriter("D:\\java_Lianxi\\idea-test\\src\\baobao\\kaoshi\\hh2.txt");
            int len;
            char[] cbuf = new char[5];
            while ((len = fileReader.read(cbuf)) != -1) {
                    fileWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
