package baobao.LIANxi;

public class Erfenfa {//二分法寻找数据
    public static void main(String[] args) {
        int[] arr =new int[]{-2,-34,6,50,70,100};
        int dest =70;
        int head=0;
        int end =arr.length-1;
        boolean fff=true;
        while (head<=end){
            int middle=(head+end)/2;//求中间值
            if(dest==arr[middle]){
                System.out.println("找到了"+middle);
                fff=false;
                break;
            }else if(dest<arr[middle]){
                end=middle-1;//数据比中间值小
            }else if(dest>arr[middle]){
                head=middle+1;//数据比中间值大
            }
        }
            if(fff){
                System.out.println("没找着");
            }
    }
}
