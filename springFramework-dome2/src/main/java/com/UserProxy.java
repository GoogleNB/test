package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

/**
 * @Date ：2022/5/10 16:25
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：UserProxy.java
 * @Software：IntelliJ IDEA
 * 创建增强类，不同方法代表不同通知类型
 */
@Component
@Aspect

//生成代理对象
public class UserProxy {




//before注解表示作为前置通知
    @Before(value = "execution(* com.User.eat(..))")
    public void before(){
        System.out.println("Before");
    }

    @Around(value = "execution(* com.User.eat(..))")
    public void Around(@NotNull ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around");

            Object proceed = proceedingJoinPoint.proceed();
        System.out.println("Around");

    }


    //相同切入点抽取
    @Pointcut(value = "execution(* com.User.eat(..))")
    public void After(){
        System.out.println("After");
    }
    @AfterReturning(value = "After()")
    public void AfterReturning(){
        System.out.println("AfterReturning");
    }

    @AfterThrowing (value = "execution(* com.User.eat(..))")
    public void AfterThrowing(){
        System.out.println("@AfterThrowing");
    }



}
