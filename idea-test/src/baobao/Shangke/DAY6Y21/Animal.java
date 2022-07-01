package baobao.Shangke.DAY6Y21;

public class Animal {
    protected String name="ww";
    private int old;

    public Animal(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
    void shout(){
        System.out.println("叫");
    }
}
