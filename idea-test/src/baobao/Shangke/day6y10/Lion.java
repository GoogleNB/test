package baobao.Shangke.day6y10;

public class Lion {


    String color="黄色";
    public void run(){
        System.out.println("跑");
    }
    public String bark(){
        String sound="HOU";
        return sound;
    }
    public String getColor(){
        return color;
    }
    public String showlion(){
        return "this is "+getColor()+"狮子";
    }


    public static void main(String[] args) {
        Lion s= new Lion();
        System.out.println(s.showlion());
        s.run();
        System.out.println(s.bark());
    }
}
