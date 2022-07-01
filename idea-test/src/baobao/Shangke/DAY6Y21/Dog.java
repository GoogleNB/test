package baobao.Shangke.DAY6Y21;

public class Dog extends Animal{
    //此处不写任何代码
    private String color;

    public Dog(String name, int old, String color) {
        super(name, old);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor( String color){
        this.color=color;
    }

    @Override
 void shout() {
        super.shout();
        System.out.println("汪汪汪");
    }
    public void printName(){
        System.out.println("名字"+super.name);
    }




}
