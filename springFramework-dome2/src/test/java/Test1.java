import com.AopConfig;
import com.User;
import com.aa.Stu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Date ：2022/5/10 16:38
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Test1.java
 * @Software：IntelliJ IDEA
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")

//（3）使用一个复合注解替代上面两个注解完成整合
@SpringJUnitConfig(locations = "classpath:bean1.xml")

public class Test1 {
    @Autowired
    private Stu stu;
    @Test
    public void TestAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = context.getBean("user", User.class);
        user.eat();
    }

    @Test
    public void TestAop2(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        Stu stu = context.getBean("stu", Stu.class);
        stu.add();
    }
}
