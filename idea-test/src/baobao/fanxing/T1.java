package baobao.fanxing;

import org.junit.Test;

/**
 * @Date ：2022/5/23 21:43
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：t1.java
 * @Software：IntelliJ IDEA
 */
public class T1{

    public <T> void te(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        int i=9;
        if (i>2)
            aa:{
                System.out.println("11");

        }
        else
            bb:{
                System.out.println("22");
            }

        cc:{
            System.out.println("55555");
        }


    }
@Test
public  void main2() {
            //此处可以自定义名
            outer:
            {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (j == 5) {
                            break outer;
                        }
                        System.out.println(j);
                    }
                }
            }
    }
}
