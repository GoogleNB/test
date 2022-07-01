package baobao.Shangke.DAY6Y21;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("ww",3,"y");
//        dog.setName("莫阳泉");
        dog.setOld(3);
        System.out.println("名称:"+dog.getName()+"年龄:"+dog.getOld());
        dog.shout();
        dog.printName();
    }

@Test
    public void dd() {
        int t;int sum=0;
        Random random = new Random();
    int[] x = new int[10];
            for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
        }

//    int[] x = {1, 3, 2, 4, 3, 5, 10, 8, 7,9};
        for (int i=0; i < x.length - 1; i++)
            for (int j=0; j < x.length-i-1; j++) {
                if (x[j] > x[j + 1]) {
                    t = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = t;
                }
            }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");

        }
    for (int i = 0; i < x.length; i++) {
        sum += x[i];
    }
    System.out.println();
        System.out.println("总分"+sum+" "+"平均分"+(sum/=10));

    }
}
