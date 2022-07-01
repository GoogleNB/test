package baobao.Shangke.day6Y19;

public class Stude {
    String name;
    int age;
  static String school = "A大学";

//    public Stude(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
    {
        System.out.println("构造代码块");
    }
    static{
        System.out.println("静态");
    }

    public Stude() {
        System.out.println("构造");
    }


    public void info() {
        System.out.println("Stude{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}');

    }
}
