package baobao.DaErShang.ZuoYe.day916;

public class Person {
    private String name;
    private String old;
    private boolean sex;

    public Person(String name, String old, boolean sex) {
        this.name = name;
        this.old = old;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
