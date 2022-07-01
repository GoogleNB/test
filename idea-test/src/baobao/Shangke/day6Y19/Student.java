package baobao.Shangke.day6Y19;

public class Student {
  private  String name;
    private String age;

    public Student() {
        System.out.println("实例化STUDENT对象");
    }

    public Student(String name, String age) {
        this();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
