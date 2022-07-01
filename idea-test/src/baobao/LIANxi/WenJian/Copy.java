package baobao.LIANxi.WenJian;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/11/8 20:35
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Copy.java
 * @Software：IntelliJ IDEA
 */
public class Copy {
    public static void main(String[] args) throws IOException {
        FileReader fileReader1 = null;
        FileWriter fileWriter = null;
        try {
            File file1 = new File("D:\\java_Lianxi\\idea-test\\src\\baobao\\LIANxi\\WenJian\\h1.txt");
           // File file2 = new File("D:\\java_Lianxi\\idea-test\\src\\baobao\\LIANxi\\WenJian\\h2.txt");

            fileReader1 = new FileReader(file1);
            fileWriter = new FileWriter("D:\\\\java_Lianxi\\\\idea-test\\\\src\\\\baobao\\\\LIANxi\\\\WenJian\\\\h2.txt",false);


            int len;
            char[] a=new char[5];
            while ((len = fileReader1.read(a)) != -1) {
               fileWriter.write(a,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert fileReader1 != null;
            fileReader1.close();
            if (fileWriter != null) {
                fileWriter.close();
            }
        }




    }
}
