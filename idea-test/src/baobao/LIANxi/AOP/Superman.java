package baobao.LIANxi.AOP;

/**
 * @Date ：2022/5/9 21:53
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Superman.java
 * @Software：IntelliJ IDEA
 */
public class Superman implements Humanity{
    @Override
    public void eat() {
        System.out.println("吃吃吃，嘉然今天吃什么");
    }

    @Override
    public void run() {
        System.out.println("润润润，直接开润");
    }
    public int eat2(){
        return 233;
    }
}
