package baobao.Shangke;

public class Miaic {
    String name;
    String siner;

    public void printt() {
        System.out.println("歌名"+name+"歌手"+siner+"\n");
    }
}
class Phone {
    String name;

    String cpu;
    public void printt() {
        System.out.println("手机型号"+name+"CPU"+cpu);
    }

      public static void main(String[] args) {
          Phone shouj= new Phone();
          Miaic giaic = new Miaic();
          shouj.cpu="骁龙865 ";
          shouj.name="MI 10 ";
          giaic.name="鸡你太美 ";
          giaic.siner="蔡徐坤 ";
          giaic.printt();
          shouj.printt();

      }
}