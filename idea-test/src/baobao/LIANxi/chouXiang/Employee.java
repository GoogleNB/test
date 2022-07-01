package baobao.LIANxi.chouXiang;

public abstract class Employee {
    private String name;
    private String number;
    private String birthday;

    public Employee(String name, String number, String birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

//    public Employee() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

  public   abstract int earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthday='" + birthday.toString() + '\'' +
                '}';
    }
}
