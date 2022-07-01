package baobao.LIANxi.Fanshe;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/11/20 17:07
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Fansge.java
 * @Software：IntelliJ IDEA
 */
public class Fansge {

    @Test
    public void clzzTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Pension> clazz=Pension.class;
        Pension pension = clazz.getConstructor().newInstance();
        Method getName = clazz.getMethod("getName");

    }
}
