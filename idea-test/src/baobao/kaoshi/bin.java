package baobao.kaoshi;

public class bin {
    private int id;
    private int data;
    private int jiage;
    private int name;

    public bin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getJiage() {
        return jiage;
    }

    public void setJiage(int jiage) {
        this.jiage = jiage;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bin{" +
                "id=" + id +
                ", data=" + data +
                ", jiage=" + jiage +
                ", name=" + name +
                '}';
    }
}
