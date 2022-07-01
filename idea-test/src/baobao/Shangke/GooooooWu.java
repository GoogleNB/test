package baobao.Shangke;
import java.util.*;
class men{
    private int number;
    private String date;
    private String name;
    private int jifen;

    public void setnumber(int number) {
        int n=0,s=number;
        while (s>0){
            s/=10;
            n++;
        }
        if (n!=4){
            throw new IllegalArgumentException("输入错误");
        }
        else
        this.number = number;
    }

    public int getnumber() {
         return number;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJifen(int jifen) {

        this.jifen = jifen;
    }

    public int getJifen() {
        return jifen;
    }
}
public class GooooooWu {
        public static void main(String[] args) {
            men yonghu1=new men();
       int flog=1;
            Scanner scan=new Scanner(System.in);
        while (flog==1){
            System.out.println("\t我行我素购物管理系统>真情回馈");
            System.out.println("***********************************");
            System.out.println("\t\t1.登录系统");
            System.out.println("\t\t0.登出系统");
            System.out.println("***********************************");
            int yy=scan.nextInt();
            if (yy==1) {
                System.out.println("\t我行我素购物管理系统>真情回馈");
                System.out.println("***********************************");
                System.out.println("\t\t1.客户信息管理");
                System.out.println("\t\t2.购物结算");
                System.out.println("\t\t3.真情回馈");
                System.out.println("\t\t4.注销");
                System.out.println("***********************************");
//        System.out.print("请选择，输入数字或按'n',返回上一级菜单:");

                int str = scan.nextInt();
                int s;
                if (str >= 1 && str <= 4) {

                    switch (str) {
                        case 1:
                            System.out.println("1显示客户信息");
                            System.out.println("2添加客户信息");
                            System.out.println("3修改客户信息");
                            System.out.println("4查询客户信息");
                            System.out.println("0返回上一级菜单");
                            s = scan.nextInt();
                            int flog2 = 1;
                            while (flog2 == 1) {
                                switch (s) {
                                    case 1:
                                        System.out.println("执行显示客户信息");
                                        System.out.println("姓名：" + yonghu1.getName());
                                        System.out.println("会员号：" + yonghu1.getnumber());
                                        System.out.println("日期：" + yonghu1.getDate());
                                        System.out.println("积分：" + yonghu1.getJifen());
                                        flog2 = 0;
                                        break;

                                    case 2:
                                        System.out.println("执行添加客户信息");
                                        System.out.println("输入姓名");
                                        yonghu1.setName(scan.next());
                                        System.out.println("输入会员号");
                                        yonghu1.setnumber(scan.nextInt());
                                        System.out.println("输入日期");
                                        yonghu1.setDate(scan.next());
                                        System.out.println("输入积分");
                                        yonghu1.setJifen(scan.nextInt());

                                        flog2 = 0;
                                        break;
                                    case 3:
                                        System.out.println("执行修改客户信息");
                                        flog2 = 0;
                                        break;
                                    case 4:
                                        System.out.println("执行查询客户信息");
                                        flog2 = 0;
                                        break;
                                    case 0:
                                        System.out.println("返回上一级");
                                        flog2 = 0;
                                        break;
                                    default:
                                        System.out.println("输入错误");
                                }
                            }
                            break;

                        case 2:
                            System.out.println("购物结算");
                            System.out.println("会员折扣");
                            float h;
                            System.out.println("输入金额");
                            h=scan.nextFloat();
                            System.out.println("输入积分");
                            yonghu1.setJifen(scan.nextInt());
                            if (yonghu1.getJifen() >= 8000) System.out.println("打6折"+h*0.6);
                            else if (yonghu1.getJifen() >= 4000) System.out.println("打7折"+h*0.7);
                            else if (yonghu1.getJifen() >= 2000) System.out.println("打8折"+h*0.8);
                            else if (yonghu1.getJifen() > 0) System.out.println("打9折"+h*0.9);
                            else System.out.println("输入错误");
                            break;

                        case 3:
                            System.out.println("真情回馈");
                            System.out.println("1幸运大放送");
                            System.out.println("2幸运抽奖");
                            System.out.println("3生日问候");
                            System.out.println("0返回上一级菜单");
                            int flog3 = 1;
                            while (flog3 == 1) {
                                System.out.println("请输入选项：");
                                s = scan.nextInt();
                                switch (s) {
                                    case 1:
                                        System.out.println("111");
                                        break;
                                    case 2:
                                        System.out.println("幸运大抽奖");
                                        int random = (int) ((Math.random()) * 10);
                                        if (yonghu1.getnumber() / 100 % 10 == random) {
                                            System.out.println("恭喜中大奖了" + random);
                                        } else System.out.println("你只是个普通人");
                                        break;
                                    case 3:
                                        System.out.println("333");
                                        break;
                                    case 0:
                                        System.out.println("返回上一级");
                                        flog3 = 0;
                                        break;
                                    default:
                                        System.out.println("输入错误");
                                }
                            }

                            break;

                    }

                }
            }else if (yy==0){
                System.out.println("执行注销");
                flog = 0;
            }
        else System.out.println("输入错误，请重新输入");

        }
    }
}

