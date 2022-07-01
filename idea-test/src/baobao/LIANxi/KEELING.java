package baobao.LIANxi;

public class KEELING {
    public static void main(String[] args) {
    Wangle ming = new Wangle();
    ming.setW("ads");
    ming.setX(123);
        System.out.println(ming.getW());
        System.out.println( ming.getX());
        posed k=new posed();
        k.setW("csa");
        System.out.println(k.getW());
        System.out.println(k.getA());
    }
}
class Wangle {   //类的封装
    private String w;
    protected int  x=1;

    public void setW(String w) {
        this.w = w;
    }

    public String getW() {
        return w;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
class posed extends Wangle{  //类的继承
    private int a=1;

    public int getA() {
        a+=x;
        return a;
    }
}


