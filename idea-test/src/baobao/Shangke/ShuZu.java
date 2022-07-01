package baobao.Shangke;

public class ShuZu {

    public static void main(String[] args) {
        int[][]arr=new int[3][];
        arr[0]=new int[]{11,12};
        arr[1]=new int[]{ 21,22,23};
        arr[2] = new int[]{31,32,33,34};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            int sum2=0;
            for (int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
                sum2+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"组"+sum2);
        }
        System.out.println(sum);
    }
}
