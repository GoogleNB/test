package baobao.DaErShang.ZuoYe.day911;

public class XiTongPaiXu {
    public static void main(String[] args) {
        Student[] stu =new Student[10];
        XiTongPaiXu xi=new XiTongPaiXu();
       Student p1=new Student();
       stu[0]=p1;
        Student p2=new Student();
        stu[1]=p2;
        Student p3=new Student();
        stu[2]=p3;
        Student p4=new Student();
        stu[3]=p4;
        Student p5=new Student();
        stu[4]=p5;
        Student p6=new Student();
        stu[5]=p6;
        Student p7=new Student();
        stu[6]=p7;
        Student p8=new Student();
        stu[7]=p8;
        Student p9=new Student();
        stu[8]=p9;
        Student p10=new Student();
        stu[9]=p10;
        stu[0].setScore(66);
        stu[1].setScore(65);
        stu[2].setScore(70);
        stu[3].setScore(72);
        stu[4].setScore(75);
        stu[5].setScore(45);
        stu[6].setScore(88);
        stu[7].setScore(92);
        stu[8].setScore(93);
        stu[9].setScore(91);

        xi.PaiXu(stu);
        xi.ShuChu(stu);
    }
    public  void PaiXu(Student[] stu){
        Student k;
        for (int i=0;i<stu.length-1;i++){
            for (int j=0;j<stu.length-i-1;j++){
                if (stu[j].getScore()>stu[j+1].getScore()){
                    k=stu[j+1];
                    stu[j+1]=stu[j];
                    stu[j]=k;
                }
            }
        }
    }
    public void ShuChu(Student[] stu){
        for (int i=0;i<stu.length;i++){
            System.out.println(stu[i].getScore());
        }
    }

}
