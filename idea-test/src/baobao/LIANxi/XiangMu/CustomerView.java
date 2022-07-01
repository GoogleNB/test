package baobao.LIANxi.XiangMu;

import java.util.Scanner;

public class CustomerView {


    public CustomerList customerList = new CustomerList(10);
    Scanner scan = new Scanner(System.in);

    public CustomerView() {

        Customer customer = new Customer("张三", '男', 18, "0531-25525", "1789957823@qq.com");
        customerList.addCustomer(customer);
    }


    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

    public void addCustomer() {
        System.out.println("添加客户的操作");
        System.out.println("------------------添加客户--------------------");
        System.out.println("输入姓名");
        String name = scan.next();
        System.out.println("输入性别");
        char sex = scan.next().charAt(0);
        System.out.println("输入年龄");
        int old = scan.nextInt();
        System.out.println("输入手机号：");
        String phone = scan.next();
        System.out.println("输入邮箱");
        String email = scan.next();
        Customer cost = new Customer(name, sex, old, phone, email);
        boolean b = customerList.addCustomer(cost);
        if (b) {
            System.out.println("------------添加完成-------------------------");
        } else {
            System.out.println("------------------添加失败，客户已满---------------------");
        }
    }

    public void enterMainMenu() {
        boolean isFlag = true;

        while (isFlag) {
            System.out.println("****************客户信息管理软件*************************");
            System.out.println("1.添加客户");
            System.out.println("2.修改客户");
            System.out.println("3.删除客户");
            System.out.println("4.客户列表");
            System.out.println("5.退出系统");
            System.out.println("请选择1-5：");
            int x = scan.nextInt();
            for (; ; ) {


                if (x != 1 && x != 2 && x != 3 && x != 4 && x != 5) {
                    System.out.println("输入错误，请重新输入：");
                    x = scan.nextInt();
                } else break;
            }
            switch (x) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    ModifyCustomer();
                    break;
                case 3:
                    DeleteCustomer();
                    break;
                case 4:
                    listAllCustomer();
                    break;
                case 5:
                    isFlag = false;
            }

        }

    }

    public void ModifyCustomer() {//TODO 没写完
        System.out.println("修改客户的操作");
        System.out.println("-----------------修改客户的操作-----------------");
        Customer cust =new Customer();
        for (; ; ) {
            System.out.println("请输入修改客户编号（-1退出）：");
            int number = scan.nextInt();
            if (number == -1) {
                break;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        assert cust != null;
        System.out.println("姓名(" + cust.getName() + ")");
        String name = scan.next();
        cust.setName(name);
        System.out.println("性别(" + cust.getSex() + ")");
        char sex = scan.next().charAt(0);
        cust.setSex(sex);
        System.out.println("年龄(" + cust.getOld() + ")");
        int old = scan.nextInt();
        cust.setOld(old);
        
        System.out.println("电话(" + cust.getPhone() + ")");
        String phone = scan.next();
        cust.setPhone(phone);
        System.out.println("邮箱(" + cust.getEmail()+ ")");
        String email = scan.next();
        cust.setEmail(email);
    }

    public void DeleteCustomer() {
        System.out.println("删除客户的操作");
        for (; ; ) {
            System.out.println("输入你要删除用户的序号(-1返回)");
            int x = scan.nextInt();
            if (x == -1) {
                break;
            } else if (x>0){
                boolean xx = customerList.deleteCustomer(x - 1);
                if (xx) {
                    System.out.println("删除成功");
                } else System.out.println("删除失败");
                break;
            }
        }
    }

    public void listAllCustomer() {
        System.out.println("显示客户的操作");
        System.out.println("--------------------------------------------------");
        if (customerList.getTotal() == 0) {
            System.out.println("没客户记录");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] custs = customerList.getALLCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println(i + 1 + "\t" + cust.getName() + "\t" + cust.getSex() + "\t"
                        + cust.getOld() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
            }
        }
        System.out.println("--------------------客户列表完成--------------------");
    }
}
