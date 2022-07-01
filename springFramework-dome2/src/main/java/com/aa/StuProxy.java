package com.aa;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Date ：2022/5/12 10:47
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：StuProxy.java
 * @Software：IntelliJ IDEA
 */
public class StuProxy {
    public void before() {
        System.out.println("Before");
    }


    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around");

        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("Around");

    }

    public void After() {
        System.out.println("After");
    }

    public void AfterReturning() {
        System.out.println("AfterReturning");
    }


    public void AfterThrowing() {
        System.out.println("@AfterThrowing");
    }
}
