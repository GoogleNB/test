package baobao.DaErShang.ZuoYe.kaoshixitong;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;

public class Register_GUI {
    public Register_GUI() {
        RegisterFrame rf = new RegisterFrame();
        rf.setVisible(true);
    }

    public static void main(String[] args) {
        new Register_GUI();
    }

}

class RegisterFrame extends JFrame {
    private Toolkit Tool;

    public RegisterFrame() {
        setTitle("用户注册");
        Tool = Toolkit.getDefaultToolkit();
        Dimension ds = Tool.getScreenSize();
        int w = ds.width;
        int h = ds.height;
        setBounds((w - 300) / 2, (h - 300) / 2, 300, 300);
        setResizable(false);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        RegisterPanel rp = new RegisterPanel(this);
        add(rp,BorderLayout.CENTER);

    }

}

class RegisterPanel extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel titleLabe1, nameLabe1, pwdlabel1, pwdlabel2, sexLabe1, ageLabe1, classlabe1;
    private JTextField nameField, agefield;
    private JPasswordField pwdfield1, pwdfield2;
    private JButton commitbtn, resetbtn, cancelbtn;
    private JRadioButton rbtn1, rbtn2;
    private JComboBox combo;
    private Vector<String> v;
    private GridBagLayout gb1;
    private GridBagConstraints gbc;
    private JPanel panel;
    private Box box;
    private JFrame iframe;

    public RegisterPanel(JFrame frame) {
        iframe = frame;
        titleLabe1 = new JLabel("用户注册");
        titleLabe1.setFont(new Font("隶书", Font.BOLD, 24));
        nameLabe1 = new JLabel("用户名:");
        pwdlabel1 = new JLabel("密码");
        pwdlabel2 = new JLabel("确认密码");
        sexLabe1 = new JLabel("性别:");
        ageLabe1 = new JLabel("年龄");
        classlabe1 = new JLabel("所属班级");
        nameField = new JTextField(16);
        pwdfield1 = new JPasswordField(16);
        pwdfield1.setEchoChar('*');
        pwdfield2 = new JPasswordField(16);
        pwdfield2.setEchoChar('*');
        agefield = new JTextField(16);
        rbtn1 = new JRadioButton("��");
        rbtn2 = new JRadioButton("Ů");
        rbtn1.setSelected(true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtn1);
        bg.add(rbtn2);
        v = new Vector<String>();
        v.add("软件英语 053");
        v.add("软件英语 052");
        v.add("软件英语 051");
        v.add("计算机应用 051");
        v.add("计算机应用 052");
        combo = new JComboBox(v);
        commitbtn = new JButton("注册");
        commitbtn.addActionListener(this);
        resetbtn = new JButton("重置");
        resetbtn.addActionListener(this);
        cancelbtn = new JButton("取消");
        cancelbtn.addActionListener(this);
        panel = new JPanel();
        panel.add(rbtn1);
        panel.add(rbtn2);
        Border border = BorderFactory.createTitledBorder("");

        box = Box.createHorizontalBox();
        box.add(commitbtn);
        box.add(Box.createHorizontalStrut(30));
        box.add(resetbtn);
        box.add(Box.createHorizontalStrut(30));
        box.add(cancelbtn);

        gb1 = new GridBagLayout();
        setLayout(gb1);
        gbc = new GridBagConstraints();
        addCompnent(titleLabe1, 0, 0, 4, 1);
        add(Box.createVerticalStrut(20));
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 100;
        addCompnent(nameLabe1, 0, 1, 1, 1);
        addCompnent(nameField, 1, 1, 4, 1);
        addCompnent(pwdlabel1, 0, 2, 1, 1);
        addCompnent(pwdfield1, 1, 1, 4, 1);
        addCompnent(pwdfield2, 1, 3, 4, 1);
        addCompnent(pwdlabel2, 0, 3, 1, 1);
        addCompnent(sexLabe1, 0, 4, 1, 1);
        addCompnent(panel, 1, 4, 1, 1);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        addCompnent(ageLabe1, 2, 4, 1, 1);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        addCompnent(agefield, 3, 4, 2, 1);
        addCompnent(classlabe1, 0, 5, 1, 1);
        addCompnent(combo, 1, 5, 4, 1);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        addCompnent(box, 0, 6, 4, 1);
    }


    public void addCompnent(Component c, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridheight = h;
        gbc.gridwidth = w;
        add(c, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == commitbtn) {
            Register rinfo = new Register();
            rinfo.name = nameField.getText().trim();
            rinfo.password = new String(pwdfield1.getPassword());
            rinfo.sex = rbtn1.isSelected() ? "男" : "女";
            rinfo.age = agefield.getText().trim();
            rinfo.nclass = combo.getSelectedItem().toString();
            if (rinfo.name.length() == 0) {
                JOptionPane.showMessageDialog(null, "\t用户名不能为空");
                return;
            }
            if (rinfo.password.length() == 0) {
                JOptionPane.showMessageDialog(null, "\t 密码不能为空");
                return;
            }
            if (!rinfo.password.equals(new String(pwdfield2.getPassword()))) {
                JOptionPane.showMessageDialog(null, "两次密码输入不一致，请重新输入");
                return;
            }
            if (rinfo.age.length() == 0) {
                JOptionPane.showMessageDialog(null, "\t年龄不能为空");
                return;
            }
            int age = Integer.parseInt(rinfo.age);
            if (age <= 0 || age > 100) {
                JOptionPane.showMessageDialog(null, "\t年龄输入不合法");
                return;

            }
            Register_Login rl = new Register_Login(rinfo);
            rl.register();
            if (rl.regtSuces()) {
                iframe.dispose();
            }
        }
        if (e.getSource() == resetbtn) {
            nameField.setText("");
            pwdfield1.setText("");
            pwdfield2.setText("");
            rbtn1.isSelected();
            agefield.setText("");
            combo.setSelectedIndex(0);
        }
        if (e.getSource() == cancelbtn) {
            iframe.dispose();
        }
    }
}


class Register_Login {
    Register regt = new Register();
    Login Login = new Login();
    private boolean loginSuccess = false;
    private boolean regtSuccess = false;

    public Register_Login(Register reg) {
        regt = reg;
    }

    public void register() {
        File f;
        FileInputStream fi;
        FileOutputStream fo;
        Vector vuser = new Vector();
        ObjectInputStream ois;
        ObjectOutputStream oos;
        int flag = 0;
        try {
            f = new File("users.dat");
            if (f.exists()) {
                fi = new FileInputStream(f);
                ois = new ObjectInputStream(fi);
                vuser = (Vector) ois.readObject();
                for (int i = 0; i < vuser.size(); i++) {
                    Register regtmesg = (Register) vuser.elementAt(i);
                    if (regtmesg.name.equals(regt.name)) {
                        JOptionPane.showConfirmDialog(null, "该用户已经存在，请重新输入");
                        flag = 1;
                        break;
                    }
                }
                fi.close();
                ois.close();
            }
            if (flag == 0) {
                vuser.addElement(regt);
                fo = new FileOutputStream(f);
                oos = new ObjectOutputStream(fo);
                oos.writeObject(vuser);
                JOptionPane.showConfirmDialog(null, "用户" + regt.name + "注册成功," + "\n");
                regtSuccess = true;
                fo.close();
                oos.close();
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, "找不到文件'user.dat'!");

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    public boolean regtSuces() {
        return regtSuccess;
    }

    public void Login() {
        Vector vuser = new Vector();
        try {
            FileInputStream fi = new FileInputStream("users.user");
            ObjectInputStream si = new ObjectInputStream(fi);
            vuser = (Vector) si.readObject();
            for (int i = 0; i < vuser.size(); i++) {
                Register regtmesg = (Register) vuser.elementAt(i);
                if (regtmesg.name.equals(Login.name)) {
                    if (!regtmesg.password.equals(Login.password)) {
                        JOptionPane.showConfirmDialog(null, "密码不正确，请重新输入", "密码错误提示", JOptionPane.OK_CANCEL_OPTION);
                        break;

                    } else {
                        loginSuccess = true;

                    }
                } else {
                    if (i == vuser.size()) {
                        JOptionPane.showConfirmDialog(null, "用户不存在，请注册", "用户不存在提示", JOptionPane.OK_CANCEL_OPTION);

                    } else {
                        continue;
                    }
                }
            }
            fi.close();
            si.close();
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showConfirmDialog(null, "找不到文件'users.user'!");

        }
    }


    public boolean islogin() {
        return loginSuccess;
    }
}

class Register implements Serializable {
    String name;
    String password;
    String sex;
    String age;
    String nclass;
}

class Login implements Serializable {
    private static final long seralVersionUID = 1L;
    String name;
    String password;

    public Login() {

    }
}