package baobao.Shangke.day6;

public class Customer {
    String custno;                 //    会员号（custNo）
    String name;            //    姓名（name）
    char sex;             //    性别（sex）
    String birth;                //    生日（birth）
    String adr;          //    地址（adr）
    String phone;         //    电话（phone）
    String score;          //    积分（score）

    public String prinxx() {
        return "会员号"+custno+"姓名"+name;
    }
}
