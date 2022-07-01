package baobao.Shangke;

public class Fangfa {
    public static void xingxing(int x,int y) {
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static int getj(int x,int y) {
        return x*y;

    }

    public static int add(int x,int y) {
        return x+y;
    }

    public static int add(int x,int y,int z) {
        return x+y+z;
    }
    public static double add(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
//        xingxing(3,5);

//        System.out.println(getj(3,5));
//        System.out.println(add(1,3));
//        System.out.println(add(1,3,5));
//        System.out.println(add(1.0,5));

//        int[] x = new int[3];
//        x[0]=1;
//
//        System.out.println(x[0]);
//        x=null;
//        System.out.println(x[1]);
//        System.out.println(x[2]);
//        System.out.println(x.length);
//        int[] x={1,2,3,4};
//        for (int i=0;i<x.length;i++){
//            System.out.println(x[i]);
//        }
        int[] arr={4,1,6,3,9,8,2,55,11,20};
        int max=getmax(arr);
//        paijj(arr);//冒泡法
        xuan(arr);//选择法
//        printxx(arr);
//        System.out.println(max);
    }

    private static void paijj(int[] arr) {
        int k;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }
        printxx(arr);
    }
private static void xuan(int[] array){
    int i,j,k,t;
    for(i=0;i<array.length-1;i++)
    {
        k=i;
        for(j=i+1;j<array.length;j++)
            if(array[j]<array[k])
                k=j;
        t=array[k];array[k]=array[i];array[i]=t;
    }
    printxx(array);
}
    private static void printxx(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int getmax(int[]a) {
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}


