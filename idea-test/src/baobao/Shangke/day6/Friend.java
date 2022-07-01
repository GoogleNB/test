package baobao.Shangke.day6;

public class Friend {

    /* 2.  实现一个小型通讯录。定义Friend类，编写它具有的属性：
     姓名（freName）、电话（frePhone）、邮箱（freEmail）、
     和公司（freComp）以及它的toString（）方法，用来输出信息。
     编写Friend类的测试类AddFriend，实现添加联系人的功能。*/
    String frename;
    String frePhone;
    String freEmail;
    String freComp;

    @Override
    public String toString() {
        return
                "姓名:" + frename +"\n" +
                "电话:" + frePhone + "\n" +
                "邮箱:" + freEmail + "\n" +
                "地址:" + freComp + "\n" ;
    }
}
