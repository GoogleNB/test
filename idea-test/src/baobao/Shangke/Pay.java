package baobao.Shangke;
import java.util.*;
public class Pay {
//    public static void main(String[] args) {
//        int TJ, ts, wj, ws, wpj, wps;
//        float discount = 0.8f, zongjia, zhekoujie, jiaofei;
//        TJ = 245;
//        ts = 2;
//        wj = 570;
//        ws = 1;
//        wpj = 320;
//        wps = 1;
//        zongjia = TJ * ts + wj * ws + wpj * wps;
//        zhekoujie = zongjia * discount;
//        jiaofei = 1500f;
//        System.out.println("购买物品\t单价\t\t个数\t价格");
//        System.out.println("T恤\t     ￥" + TJ + "\t" + ts + "\t" + TJ * ts);
//        System.out.println("网球鞋\t  ￥" + wj + "\t" + ws + "\t" + wj * ws);
//        System.out.println("网球拍\t  ￥" + wpj + "\t" + wps + "\t" + wpj * wps);
//        System.out.println("折扣\t\t    " + discount * 10 + "折");
//        System.out.println("金额总价\t\t￥" + zhekoujie);
//        System.out.println("实际交费\t\t￥" + jiaofei);
//        System.out.println("找钱\t\t    ￥" + (jiaofei - zhekoujie));
//        System.out.println("本次购物所获得积分是：" + zhekoujie / 100 * 3);
//    }

//    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        int TJ, wj, wpj, wps;
//        float discount = 0.8f, zhekoujie, jiaofei;
//        TJ = 245;
//        wj = 570;
//        wpj = 320;
//        wps = 1;
//        int x;
//        int number=0,sum=0;
//        double shou,zhao;
//        String s="y";
//        while (s.equals("y")){
//            System.out.println("请输入你要查询的编号：");
//            x=scan.nextInt();
//            switch (x){
//
//                case 1:System.out.println("编号\t购买物品\t单价");
//                    System.out.println("1\tT恤\t     ￥" + TJ );
//                    System.out.println("请输入购买数量");
//                    number=scan.nextInt();
//                    sum+=TJ*number;
//                    break;
//
//                case 2:System.out.println("编号\t购买物品\t单价");
//                    System.out.println("2\t网球鞋\t￥" + wj);
//                    System.out.println("请输入购买数量");
//                    number=scan.nextInt();
//                    sum+=wj*number;break;
//                case 3:System.out.println("编号\t购买物品");
//                    System.out.println("3\t网球拍\t  ￥" + wpj);
//                    System.out.println("请输入购买数量");
//                    number=scan.nextInt();
//                    sum+=wpj*number;break;
//            }
//            System.out.println("是否继续？的。输入y");
//            s=scan.next();
//        }
//        System.out.println("应收"+sum);
//        System.out.println("输入收了多少");
//        shou=scan.nextDouble();
//        zhao=shou-sum*discount;
//        System.out.println("应找"+zhao);
//
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String x;
//        do {
//            System.out.println("幸运大抽奖");
//            System.out.println("输入会员号");
//            int y=scan.nextInt();
//            int random = (int) ((Math.random()) * 10);
//            if (y/ 100 % 10 == random) {
//                System.out.println("恭喜中大奖了" + random);
//            } else System.out.println("你只是个普通人");
//            System.out.println("是否继续y");
//            x=scan.next();
//        }while (x.equals("y"));
//        double old=0,young=0,x;
//        System.out.println("请输入年龄：");
//        for(int i=0;i<10;i++){
//            x=scan.nextDouble();
//            if (x>30)old++;
//            else if (x<30&&x>0) young++;
//        }
//        double bili=old/young;
//        System.out.println(bili);





//        int x;
//        for (int i = 1; i <= 3; ) {
//            System.out.println("输入会员号");
//            x = scan.nextInt();
//            if (x > 1000 & x < 9999) {
//                System.out.println("录入成功" + x+"第"+i+"条");
//                i++;
//            } else {
//                System.out.println("失败");
//            }
//        }




        String name,password,a,s;
//        name="王伟";password="lzbsk";
        System.out.println("输入注册账户和密码");
        name=scan.next();password=scan.next();
        for (int i= 2;i>=0;i--){
            System.out.println("请输入账号和密码");
            a=scan.next();
            s=scan.next();
            if (a.equals(name)&s.equals(password)){
                System.out.println("登录成功");
                break;
            }
               else {
                System.out.println("输入错误剩余次数"+i);
            }

        }
        System.out.println("账号被冻结");

    }
}
