package baobao.LIANxi.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Date ：2022/5/10 11:36
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Daili.java
 * @Software：IntelliJ IDEA
 *
 *
 * 动态代理
 * AOP原理，在不改变原有代码的情况下增强功能
 * JDK 原理 Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,nvocationHandler h)
 *
 */
public class Daili {
    public static void main(String[] args) {
        Superman superman = new Superman();
        Handler handler = new Handler(superman);
        Class[] interfaces = new Class[]{Humanity.class};
//        传入被代理类加载器，被代理类实现的接口（可以多个），增强的部分
        Humanity o = (Humanity) Proxy.newProxyInstance(Superman.class.getClassLoader(), interfaces, handler);
        o.eat();
        System.out.println("------------------------");
        o.run();
        int i = o.eat2();
        System.out.println("------------------------");
        System.out.println(i);
    }
}
class Handler implements InvocationHandler{

    Object obj;

    public Handler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("奥里给，干了");
        Object invoke = method.invoke(obj, args);//调用被代理类的方法，需传入被代理类和被代理类形参，返回被代理类的返回值
        System.out.println(method.getName());
//        System.out.println(invoke);
        System.out.println("兄弟们，润了");

        return invoke;
    }
}
