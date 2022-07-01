package baobao.LIANxi.myproject03.domain;

public class Designer extends Programmer{
    private double bonus;//奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return totoString()+"\t设计师\t"+getStatus()+"\t"+bonus+"\t\t\t"+getEquipment().getDescription();
    }
    public String getDetailsForTeam() {
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "设计师" + getBonus() + "\t";
    }
    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
