package com;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/16 12:23
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Test2.java
 * @Software：IntelliJ IDEA
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStreamReader = new FileInputStream("C:\\Users\\Windows\\Pictures\\Screenshots\\屏幕截图(69).png");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Windows\\Desktop\\2021然辅导\\2.png");
        IOUtils.copy(inputStreamReader, fileOutputStream);
        inputStreamReader.close();
    }
}
