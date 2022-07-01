package baobao.LIANxi.myproject03.domain;

public class Architect extends Designer {
    private int stock;//股票

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public Architect() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return totoString() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock+"\t" + getEquipment().getDescription();
    }
    public String getDetailsForTeam() {
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() +
                "\t" + "结构师" + getBonus() + "\t"+getStock()+"\t";
    }
}
