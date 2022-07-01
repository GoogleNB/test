package baobao.Shangke;
import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        switch (a){
            case 1:
                case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("周末");
                break;
            default:
                System.out.println("错误");
        }
    }
}
