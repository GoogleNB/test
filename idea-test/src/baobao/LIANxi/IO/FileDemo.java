package baobao.LIANxi.IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/11/7 11:03
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：FileDemo.java
 * @Software：IntelliJ IDEA
 */
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\IO\\hello.txt");
        File destfile = new File(file.getParent(), "haha.txt");
        boolean newFile = destfile.createNewFile();
        if (newFile) {
            System.out.println("常见成功");
        }
    }
}
