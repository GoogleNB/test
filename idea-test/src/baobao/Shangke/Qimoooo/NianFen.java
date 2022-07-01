package baobao.Shangke.Qimoooo;
//判断2000 1.1到2008 1.1 相距几天
public class NianFen {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2000; i <= 2008; i++) {
            sum+=256;
            if (i % 400 == 0 || (i % 4 == 0 & i % 100 != 0)) {
                sum+=1;
            }
        }
        System.out.println(sum);
    }
//class A{
//        protected boolean equals(){
//            return super.equals();
//
//        }
//}

}
