package baobao.LIANxi.chouXiang;

public class SalaryEmployee extends Employee{
    private String monthlySalary;

    public SalaryEmployee(String name, String number, String birthday) {
        super(name, number, birthday);
    }

    @Override
   public int earnings() {
       return 0;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "monthlySalary='" + monthlySalary + '\'' +
                super.toString()+
                '}';
    }
}
