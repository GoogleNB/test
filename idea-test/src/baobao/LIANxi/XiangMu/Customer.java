package baobao.LIANxi.XiangMu;

public class Customer {
    private String name;//姓名
    private char sex;//性别
    private int old;//年龄
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {
    }

    public Customer(String name, char sex, int old, String phone, String email) {
        this.name = name;
        this.sex = sex;
        this.old = old;
        this.phone = phone;
        this.email = email;
    }
}
