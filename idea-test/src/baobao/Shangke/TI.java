package baobao.Shangke;

public class TI {
    public static void main(String[] args) {
    int day=46;
    double radius=1.5;
    double pi=3.1415926535897;
        System.out.printf("周数%d 剩余天数%d\n",day%7,day/7);
        //todo 用法区分
        System.out.println("周数"+day%7+" 天数"+day/7);
        System.out.println("圆的半径是"+(pi*radius*radius));
    }
}
