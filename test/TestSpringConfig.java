import cn.gcc.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-06.
 */
public class TestSpringConfig {

    @org.junit.Test
    public void test1(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
    }
}
