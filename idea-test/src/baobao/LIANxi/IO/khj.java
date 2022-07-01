package baobao.LIANxi.IO;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/5 21:02
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：khj.java
 * @Software：IntelliJ IDEA
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class windowEventDemo extends JFrame{
    Container content;
    JTextArea jtf;
    public windowEventDemo(){
        content=getContentPane();
        jtf=new JTextArea(10,20);
        content.setLayout(new FlowLayout());
        addWindowListener(new MyWindowListener());
        content.add(jtf);
        setTitle("窗口事件测试");
        setSize(300,200);
        setVisible(true);
    }

    class MyWindowListener implements WindowListener {


        @Override
        public void windowOpened(WindowEvent e) {
            jtf.append("\n窗口正在关闭");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            jtf.append("\n窗口被打开");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            jtf.append("\n窗口最小化");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            jtf.append("\n撤销图标化");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            jtf.append("\n程序结束运行，关闭窗口");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            jtf.append("\n窗口被激活");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            jtf.append("\n窗口不在激活状态");
        }
    }

    public static void main(String[] args) {
        new windowEventDemo();
    }
}

