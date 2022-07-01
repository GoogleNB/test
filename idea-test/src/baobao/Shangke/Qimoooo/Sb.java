package baobao.Shangke.Qimoooo;



import java.util.Random;
import java.util.Scanner;

public class Sb{

            public static void main(String[] args) {
                // TODO Auto-generated method stub
                int t; int sum=0,i;
                Random sc=new Random();
                int[]x=new int[10];
                for( i=0;i<x.length;i++) {
                    x[i]=sc.nextInt(10);
                }
                System.out.print("随机生成的10个数是:");
                for( i=0;i<x.length;i++) {
                    System.out.print(x[i]+"     ");
                }
                for( i=0;i<x.length-1;i++) {
                    for(int j=0;j<x.length-1-i;j++) {
                        if(x[j]>x[j+1]) {
                            t=x[j];
                            x[j]=x[j+1];
                            x[j+1]=t;
                        }
                    }
                    System.out.print("\n按升序排序:");
                    for(i=0;i<x.length;i++) {
                        System.out.print(x[i]+"   ");
                    }
                    Scanner scanner = new Scanner(System.in);
                    scanner.next().charAt(0);
                }
            }

        }


