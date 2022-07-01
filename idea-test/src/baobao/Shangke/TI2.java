package baobao.Shangke;
import java.util.Scanner;
public class TI2 {
//    public static void main(String[] args) {
//       int flog=1;
//        while (flog==1){
//        System.out.println("\t我行我素购物管理系统>真情回馈");
//        System.out.println("***********************************");
//        System.out.println("\t\t1.客户信息管理");
//        System.out.println("\t\t2.购物结算");
//        System.out.println("\t\t3.真情回馈");
//        System.out.println("\t\t4.注销");
//        System.out.println("***********************************");
////        System.out.print("请选择，输入数字或按'n',返回上一级菜单:");
//        Scanner scan=new Scanner(System.in);
//        int str= scan.nextInt();
//        int s;
//        if(str>=1&&str<=4) {
//
//            switch (str) {
//                case 1:
//                    System.out.println("1显示客户信息");
//                    System.out.println("2添加客户信息");
//                    System.out.println("3修改客户信息");
//                    System.out.println("4查询客户信息");
//                    System.out.println("0返回上一级菜单");
//                    s=scan.nextInt();
//                    int flog2=1;
//                    while (flog2==1) {
//                        switch (s) {
//                            case 1:
//                                System.out.println("执行显示客户信息");flog2=0;flog=0;break;
//                            case 2:
//                                System.out.println("执行添加客户信息");flog2=0;flog=0;break;
//                            case 3:
//                                System.out.println("执行修改客户信息");flog2=0;flog=0;break;
//                            case 4:
//                                System.out.println("执行查询客户信息");flog2=0;flog=0;break;
//                            case 0:
//                                System.out.println("返回上一级");flog2=0;break;
//                            default:
//                                System.out.println("输入错误");
//                        }
//                    }break;
//
//                case 2 : System.out.println("购物结算");flog=0; break;
//
//                case 3 :System.out.println("真情回馈");
//                        System.out.println("1幸运大放送");
//                        System.out.println("2幸运抽奖");
//                        System.out.println("3生日问候");
//                        System.out.println("0返回上一级菜单");
//                        int flog3=1;
//                        while (flog3==1){
//                            System.out.println("请输入选项：");
//                        s=scan.nextInt();
//                        switch (s){
//                            case 1:
//                                System.out.println("111");break;
//                            case 2:
//                                System.out.println("222");break;
//                            case 3:
//                                System.out.println("333");break;
//                            case 0:
//                                System.out.println("返回上一级");flog3=0; break;
//                            default:
//                                System.out.println("输入错误");
//                        }
//                        }
//                break;
//
//                case 4 : System.out.println("执行注销"); flog=0;
//
//
//            }
//
//        }
//        else System.out.println("输入错误，请重新输入");
//
//        }
//    }




public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("请输入年份：");
    int x=scan.nextInt();
    boolean flog=false;
    if ((x%4==0&&x%100!=0)|x%400==0) {
        System.out.println(x + "是闰年");flog=true;
    }
    else System.out.println(x+"不是闰年");
    System.out.println("请输入月份");
    int y=scan.nextInt();
    if (y>=1&&y<=12) {
        if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
            System.out.println("这年这月有31天");
        } else if (y == 2) {
            if (flog) {
                System.out.println("这年这月29天");
            } else System.out.println("这年这月28天");
        } else System.out.println("这年这月30天");
    }else System.out.println("输入错误");
}
}
