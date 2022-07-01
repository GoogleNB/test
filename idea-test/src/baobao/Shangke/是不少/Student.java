package baobao.Shangke.是不少;

public class Student {
    public static void main(String[] args) {

        int sum=0;
        for (int i=1;i<=100;i++){
            boolean flag=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("和为"+sum);

    }
}
