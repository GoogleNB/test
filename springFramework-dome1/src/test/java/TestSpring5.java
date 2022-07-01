import com.spring5.Emp;
import com.spring5.User;
import com.spring5.config.Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Date ：2022/5/1 12:10
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：TestSpring5.java
 * @Software：IntelliJ IDEA
 */


public class TestSpring5 {
    @Test
    public void test5add(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");


        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void test6add(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");


        Emp bean = context.getBean("emp", Emp.class);
        System.out.println(bean.toString());

    }


//    完全注解开发
    @Test
    public void test7add(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        Emp bean = context.getBean("emp", Emp.class);
        System.out.println(bean.toString());

    }
}
