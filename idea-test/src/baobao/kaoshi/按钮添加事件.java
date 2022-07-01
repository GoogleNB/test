package baobao.kaoshi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/22 8:47
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：按钮添加事件.java
 * @Software：IntelliJ IDEA
 */
public class 按钮添加事件 extends JFrame implements ActionListener {
    JButton jb;
    public 按钮添加事件() {
        JPanel jp = new JPanel();
         jb = new JButton("按钮");
        jp.add(jb);
        add(jp);
        jb.addActionListener(this);
        this.setVisible(true);
        this.setBounds(500,500,500,500);
    }

    public static void main(String[] args) {
        new 按钮添加事件();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb)
       JOptionPane.showMessageDialog(null,"你点击了按钮");
    }
}
