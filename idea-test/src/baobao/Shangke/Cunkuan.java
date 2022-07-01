package baobao.Shangke;

public class Cunkuan {
    public static void main(String[] args) {
        double x=10000l,a,b,c,d;
       a = x * 0.0225;
       b=x*0.027*2;
       c=x*0.0324*3;
       d=x*0.036*5;
        System.out.println("本金为"+x);
        System.out.println("存款一年的本息为"+(a+x));
        System.out.println("存款二年的本息为"+(b+x));
        System.out.println("存款三年的本息为"+(c+x));
        System.out.println("存款五年的本息为"+(d+x));
    }
}
