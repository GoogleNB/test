package baobao.LIANxi.XiangMu;

public class CustomerList {
    private Customer[] customers;//保存客户对象的数组
    private int total = 0;//记录已保存客户的数量

    public CustomerList(int totalCustomer) {
        customers =new Customer[totalCustomer];
    }


    public boolean addCustomer(Customer customer) {//添加用户
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {//修改用户
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {//删除用户
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[index + 1];
        }
        customers[--total] = null;
        return true;
    }

    public Customer[] getALLCustomers() {//输出所有用户
//        return customers;
        Customer[] custs = new Customer[total];
        for (int i=0; i < total; i++) {
            custs[i]=customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if (index<0||index>total){
            return null;
        }
        return customers[index];
    }
    public int getTotal(){
        return total;
    }
}
