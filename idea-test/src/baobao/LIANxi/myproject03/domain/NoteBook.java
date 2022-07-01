package baobao.LIANxi.myproject03.domain;

public class NoteBook implements Equipment {
    private String model;//机器型号
    private int price;//机器价格

    public NoteBook(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public NoteBook() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
