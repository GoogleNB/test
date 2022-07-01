package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Date ：2022/5/12 10:45
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：AopConfig.java
 * @Software：IntelliJ IDEA
 */
@Configuration
@ComponentScan(basePackages = "com")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
