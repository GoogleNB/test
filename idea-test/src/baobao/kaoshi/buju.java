package baobao.kaoshi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/12 19:32
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：buju.java
 * @Software：IntelliJ IDEA
 */
public class buju extends JFrame implements ActionListener{
    public buju()  {

        JLabel jLabel = new JLabel("账号");
        JTextField jTextField = new JTextField(10);
        JPasswordField jPasswordField = new JPasswordField( 10);
        jPasswordField.setEchoChar('*');
        JPanel jPanel = new JPanel(new  BorderLayout());
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        jPanel1.add(jTextField);
        jPanel2.add(jPasswordField);
        jTextField.addActionListener(this);
        jPanel.setSize(200,200);
        jPanel.add(jLabel, BorderLayout.NORTH);
        jPanel.add(jPanel1,BorderLayout.SOUTH);
        jPanel.add(jPanel2,BorderLayout.EAST);
        add(jPanel);
        setBounds(100,100,500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        buju buju = new buju();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
