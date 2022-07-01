package baobao.DaErShang.ZuoYe.day911;

public class ZhengChangPaiXu {
    public static void main(String[] args) {
        int[] score=new int[]{20,98,66,50,60,85,65,77,85,30};
        int k;
        for (int i=0;i<score.length-1;i++){
            for (int j=0;j<score.length-i-1;j++){
                if (score[j+1]<score[j]){
                    k=score[j+1];
                    score[j+1]=score[j];
                    score[j]=k;
                }
            }
        }
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
    }
}
