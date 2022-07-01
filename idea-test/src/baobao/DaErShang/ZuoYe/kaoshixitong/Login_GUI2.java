package baobao.DaErShang.ZuoYe.kaoshixitong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * -*- coding = utf-8 -*-
 *在线考试系统登陆界面
 * @Time:2021/10/18 20:39
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Login_GUI.java
 * @Software：IntelliJ IDEA
 */
public class Login_GUI2 {
    public static void main(String[] args) {
        new LoginFrame2();
    }
}

class LoginFrame2 extends JFrame implements ActionListener {
private JButton loginbtn,registerbtn,cancelbtn;
private JTextField namefield;
private JPasswordField pwdfield;
    public LoginFrame2() {
        //JPanel pan = new JPanel();
        //JPanel panda = new JPanel();
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JPanel pan3 = new JPanel();
        JPanel pan121 = new JPanel();
        JPanel pan122 = new JPanel();
        //添加组件，采用边框布局
        BorderLayout b1 = new BorderLayout();
        setLayout(b1);
        JLabel titlelabel = new JLabel("欢迎使用考试系统");
        titlelabel.setFont(new Font("隶书",Font.BOLD,24));
        JLabel namelabel = new JLabel("用户名：");
        JLabel pwdlabel = new JLabel( "    密码：");
         namefield = new JTextField(16);
         pwdfield = new JPasswordField(16);
        pwdfield.setEchoChar('*');
        loginbtn = new JButton("登录");
        registerbtn = new JButton("注册");
        cancelbtn = new JButton("取消");

        loginbtn.addActionListener(this);
        cancelbtn.addActionListener(this);
        registerbtn.addActionListener(this);

        pan1.add(titlelabel);
        pan121.add(namelabel);
        pan121.add(namefield);
        pan122.add(pwdlabel);
        pan122.add(pwdfield);
        pan2.add(pan121, BorderLayout.NORTH);
        pan2.add(pan122, BorderLayout.SOUTH);
        pan3.add(loginbtn);
        pan3.add(registerbtn);
        pan3.add(cancelbtn);
        add(pan1, BorderLayout.NORTH);
        add(pan2,BorderLayout.CENTER);
        add(pan3, BorderLayout.SOUTH);
        //pan.setSize(10,100);
       setBounds(400,200,300,200);
//        panda.add(pan);
//        this.add(panda);
//        this.setTitle("用户登录");
//        this.setSize(200, 300);
//        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginbtn){
            if (namefield.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null,"\t请输入用" +
                        "户名","用户名空提示",JOptionPane.OK_OPTION);
            }
            else {
                if (new String(pwdfield.getPassword()).equals("")) {
                    JOptionPane.showMessageDialog(null,"\t请输入" +
                            "密码","密码空提示",JOptionPane.OK_OPTION);
                }
                else {
                    if (namefield.getText().trim().equals("admin")&&new String(pwdfield.getPassword()).equals("123456")) {
                        JOptionPane.showMessageDialog(null,"\t欢迎进入" +
                                "考试系统","登陆成功",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"\t账号活或" +
                                "密码错误","错误提示",JOptionPane.OK_OPTION);
                    }
                }
            }


        }
        if (e.getSource() == registerbtn) {
            // new Register_GUI();//进入注册界面
            dispose();
        }if (e.getSource() == cancelbtn) {
            System.exit(0);
        }
    }
}
