package baobao.DaErShang.ZuoYe.zhujie;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/6 20:54
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：asd.java
 * @Software：IntelliJ IDEA
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Label {
    String value();
}