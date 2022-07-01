package baobao.Shangke.day6Y17;

public class LaJi {
    private String name;
    private int old;

    public LaJi(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public LaJi(String name) {
        this.name = name;
    }

    public LaJi() {
    }


    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        if (old <=0) {
            throw new IllegalArgumentException("invalid age value");
//            System.out.println( "输入错误");
        }
        else
        this.old = old;
    }
}
